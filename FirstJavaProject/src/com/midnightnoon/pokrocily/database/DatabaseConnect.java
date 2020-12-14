package com.midnightnoon.pokrocily.database;

import java.sql.*;

public class DatabaseConnect {
    public static void main(String[] args) throws SQLException {
        //1.registrácia driveru
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        String user = "jaro";
        String password = "heslo123";
        String port = "3306";
        String dbname = "databasename";
        Connection connection = null;
        Statement st = null;
        long id = 10;

        //2.vytvorenie pripojenia
        try {
            connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/databasename?characterEncoding=UTF-8", user, password);

            //vypnutie autokomitu zmien
            connection.setAutoCommit(false);

            //3.vytvorenie statementu
            st = connection.createStatement();

            //4.odoslanie príkazu do databázy
            ResultSet rs = st.executeQuery("SELECT * FROM Osoba");

            //statement - vytvorenie príkazov
            //pri tomto type hrozí SQL inject útok
            String query = "SELECT * FROM Osoba WHERE id=1";
            String query2 = String.format("SELECT * FROM Osoba WHERE id=" + id);

            //ak použijem PreparedStatement tak SQLinjectu dokážem zabrániť
            PreparedStatement statement =
                    connection.prepareStatement("INSERT INTO Osoba(Meno,Vek,Datum_Narodenia) VALUES (?,?,?)");

            //teraz musím nahradiť ? hodnotami
            //označované sú od 1 vyššie
            statement.setString(1, "Jaro");
            statement.setInt(2, 30);
            //ak dávam dátum cez preparedStatement tak musí byť java.sql.Date
            //java.util.Date môžem použiť na prípravu java.sql.Date
            statement.setDate(3, new java.sql.Date(new java.util.Date().getTime()));

            //vykonanie preparedStatement
            //nemusím zadávať query do zátvoriek nakoľko ho statement už má v sebe
            statement.executeQuery();

            //4a.spracovanie dát z ResultSetu
            //použijem while keďže ResultSet má metódu next() ktorá vracia true ak existuje ďalší záznam
            while(rs.next()){
                String meno = rs.getString(1);
                int age = rs.getInt("AGE");
                //4b. dáta môžem následne uložiť do objektu, prípadne ich ináč spracovať
                //...
            }

            //5.uzatvorenie spojenia
            //najprv zatvorím statement hneď potom, ako som spracoval jeho dáta
            //keď zatvorím statement, zatvorí sa aj ResultSet
            //momentálne presunuté do finally bloku
            connection.commit();

        } catch (SQLException throwables) {
            try {
                //ak nastane výnimka, spravím rollback na dátach v db
                //to sa ale nemusí podariť, preto try/catch blok
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        }finally {
            //ZATVORENIE SPOJENIA
            //pozor, tiež hádže výnimky
            if(st != null){
                st.close();
                connection.close();
            }
        }
    }
}
