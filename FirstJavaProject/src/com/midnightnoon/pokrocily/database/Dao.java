package com.midnightnoon.pokrocily.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//abstract lebo nechcem nikdy aby bolo možné vytvoriť inštanciu tejto triedy
public abstract class Dao {
    private Connection conn = null;

    //na načítanie dát pre vytvorenie spojenia použijem PropertiesReader
    private PropertiesReader propertiesReader = new PropertiesReader();

    Dao() throws SQLException{
        String user = propertiesReader.getProperty(PropertiesReader.ORACLE_USER);
        String psw = propertiesReader.getProperty(PropertiesReader.ORACLE_PSW);
        connect(user, psw);
    }

    private void connect(String usr, String pwd) throws SQLException {
        try{
            //registrácia driveru
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        //vytvorenie spojenia
        conn = DriverManager.getConnection(getConnectionUrl(), usr, pwd);

        if(conn != null){
            //vypnutie autoCommitu
            conn.setAutoCommit(false);
        } else {
            throw new SQLException("Connection is NULL");
        }
    }

    private String getConnectionUrl() {
        String host = propertiesReader.getProperty(PropertiesReader.ORACLE_HOST);
        String port = propertiesReader.getProperty(PropertiesReader.ORACLE_PORT);
        String dbname = propertiesReader.getProperty(PropertiesReader.ORACLE_DB_NAME);

        return String.format("jdbc:oracle:thin:@%s:%s:%s", host, port, dbname);
    }

    public void disconnect(){
        try{
            conn.close();
        } catch (SQLException e){
            System.err.println("Cannot close connection");
        }
    }

    public void commit(){
        try{
            conn.commit();
        } catch (SQLException e){
            System.err.println("Cannot commit transaction in connection");
        }
    }

    public void rollBack(){
        try{
            conn.rollback();
        } catch (SQLException e){
            System.err.println("Cannot roll back transaction in connection");
        }
    }

    public Connection getConn(){
        return conn;
    }

}
