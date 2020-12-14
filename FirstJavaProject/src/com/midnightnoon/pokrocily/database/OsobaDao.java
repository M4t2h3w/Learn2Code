package com.midnightnoon.pokrocily.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OsobaDao extends Dao{
    public OsobaDao() throws SQLException{
        super();
    }

    public long create(Osoba osoba) throws Exception{
        long id = -1L;
        PreparedStatement st = null;
        try{
            String[] generatedId = {"ID"};
            st = getConn().prepareStatement("INSERT INTO Osoba (MENO,VEK,DATUM_NARODENIA) VALUES (?,?,?)");
            st.setString(1, osoba.getMeno());
            st.setInt(1, osoba.getVek());
//            st.getDate(1, new java.sql.Date(osoba.getDatumNarodenia().getTime()));
            st.execute();

            try (ResultSet generatedColumn = st.getGeneratedKeys()){
                if(generatedColumn.next()){
                    id = generatedColumn.getLong(1);
                }else {
                    throw new SQLException("Vytvorenie Osoby sa nepodarilo. Nevratilo ziadne id.");
                }
            }
        }catch (Exception e){
            throw new Exception(e);
        }finally {
            try{
                if(st != null){
                    st.close();
                }
            }catch (SQLException e) {
                System.err.println("....");
            }
        }
        return id;
    }
}
