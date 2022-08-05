package com.equinix.test.functional;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class TestUtilis {
    public static HashMap<String, String> ReadPropertiesFile(String filename) {
      HashMap<String, String> map = new HashMap<>();
        try {
            File file = new File(filename);
            FileInputStream fileInput = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInput);
            fileInput.close();

            Enumeration enuKeys = properties.keys();
            while (enuKeys.hasMoreElements()) {
               String key = (String) enuKeys.nextElement();
               String value = properties.getProperty(key);
               map.put(key, value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
      return map;
    }
}