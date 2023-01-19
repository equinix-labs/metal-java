#! /bin/bash

# Equinix Metal OAS 3.0.0
SPEC_DIR_FETCHED_FILE=oas3.fetched/
SPEC_DIR_PATCHED_FILE=oas3.patched/

rm -rf ${SPEC_DIR_PATCHED_FILE}
cp -r ${SPEC_DIR_FETCHED_FILE} ${SPEC_DIR_PATCHED_FILE}

## Patches list

## patch 1 : OTPs
PATCH_01_TARGET_01=oas3.patched/openapi/public/openapi3.yaml
PATCH_01_SOURCE_01=../patches/spec.fetched.json/01-otps/01-openapi-yaml.patch
patchMappingTarget+=(${PATCH_01_TARGET_01})
patchMappingSource+=(${PATCH_01_SOURCE_01})

PATCH_01_TARGET_02=oas3.patched/openapi/public/paths/user/otp/recovery-codes.yaml
PATCH_01_SOURCE_02=../patches/spec.fetched.json/01-otps/02-recovery-codes-yaml.patch
patchMappingTarget+=(${PATCH_01_TARGET_02})
patchMappingSource+=(${PATCH_01_SOURCE_02})

PATCH_01_TARGET_03=oas3.patched/openapi/public/paths/user/otp/sms/receive.yaml
PATCH_01_SOURCE_03=../patches/spec.fetched.json/01-otps/03-sms-receive-yaml.patch
patchMappingTarget+=(${PATCH_01_TARGET_03})
patchMappingSource+=(${PATCH_01_SOURCE_03})

PATCH_01_TARGET_04=oas3.patched/openapi/public/paths/user/otp/verify/otp.yaml
PATCH_01_SOURCE_04=../patches/spec.fetched.json/01-otps/04-verfiy-otp-yaml.patch
patchMappingTarget+=(${PATCH_01_TARGET_04})
patchMappingSource+=(${PATCH_01_SOURCE_04})

## patch 2 : metal gateways
PATCH_02_TARGET_01=oas3.patched/openapi/public/paths/metal-gateways/id.yaml
PATCH_02_SOURCE_01=../patches/spec.fetched.json/02-metal-gateways/01-metal-gateways-id-yaml.patch
patchMappingTarget+=(${PATCH_02_TARGET_01})
patchMappingSource+=(${PATCH_02_SOURCE_01})

PATCH_02_TARGET_02=oas3.patched/openapi/public/paths/projects/project_id/metal-gateways.yaml
PATCH_02_SOURCE_02=../patches/spec.fetched.json/02-metal-gateways/02-metal-gateways-yaml-findMetalGatewaysByProject.patch
patchMappingTarget+=(${PATCH_02_TARGET_02})
patchMappingSource+=(${PATCH_02_SOURCE_02})

## patch 3 : device
PATCH_03_TARGET_01=oas3.patched/openapi/public/components/schemas/DeviceCreateInput.yaml 
PATCH_03_SOURCE_01=../patches/spec.fetched.json/03-device/01-DeviceCreateInput-yaml.patch
patchMappingTarget+=(${PATCH_03_TARGET_01})
patchMappingSource+=(${PATCH_03_SOURCE_01})

## patch 4 : hardware reservations
PATCH_04_TARGET_01=oas3.patched/openapi/public/paths/hardware-reservations/id.yaml
PATCH_04_SOURCE_01=../patches/spec.fetched.json/04-hardware-reservations/01-fix-findHardwareReservationById-response-id-yaml.patch
patchMappingTarget+=(${PATCH_04_TARGET_01})
patchMappingSource+=(${PATCH_04_SOURCE_01})

## patch 5 : facility input
PATCH_05_TARGET_01=oas3.patched/openapi/public/components/schemas/FacilityInput.yaml
PATCH_05_SOURCE_01=../patches/spec.fetched.json/05-facility-input/01-make-it-java-generator-lack-of-support-for-primitive-anyof.patch
patchMappingTarget+=(${PATCH_05_TARGET_01})
patchMappingSource+=(${PATCH_05_SOURCE_01})


echo "Patch list :"
for i in "${!patchMappingTarget[@]}"
do
   printf "\nPatch source : ${patchMappingSource[$i]}\n"
   printf "Target       : ${patchMappingTarget[$i]}\n"
   patch --no-backup-if-mismatch -N -t ${patchMappingTarget[$i]} ${patchMappingSource[$i]}
done