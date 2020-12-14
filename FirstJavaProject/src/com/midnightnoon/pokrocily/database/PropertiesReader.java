package com.midnightnoon.pokrocily.database;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class PropertiesReader {
    public static final String ORACLE_HOST = "oracledb.host";
    public static final String ORACLE_PORT = "oracledb.port";
    public static final String ORACLE_DB_NAME = "oracledb.dbname";
    public static final String ORACLE_USER = "oracledb.user";
    public static final String ORACLE_PSW = "oracledb.psw";

    public String getProperty(String property){
        String fileName = "applicaton.properties";
        String propertyValue = "";
        java.util.Properties prop = new java.util.Properties();
        InputStream input = null;

        try{
            input = getClass().getClassLoader().getResourceAsStream(fileName);
            if(input == null){
                //LOG.error("Unable to find " + fileName);
                return "Sorry, unable to find " + fileName;
            }

            prop.load(input);

            propertyValue = prop.getProperty(property);
            if(propertyValue != null && !propertyValue.isEmpty()){
                return propertyValue;
            } else {
                //LOG.error("Property '" + property +"' not specified in application.properties");
                return null;
            }
        } catch (FileNotFoundException ex){

        } catch (IOException ex){

        }

        return propertyValue;
    }
}
