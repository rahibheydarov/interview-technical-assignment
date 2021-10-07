package com.amazon.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //Creating properties object
    private static Properties properties = new Properties();

    static {

        try {
            //Loading the file into FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            //Loading properties object with the file (configuration.properties)
            properties.load(file);

            //closing the file
            file.close();

        } catch (IOException e) {

            System.out.println("File not found in Configuration properties.");

        }

    }

    public static String getProperty(String keyword){

        return properties.getProperty(keyword);
    }
}
