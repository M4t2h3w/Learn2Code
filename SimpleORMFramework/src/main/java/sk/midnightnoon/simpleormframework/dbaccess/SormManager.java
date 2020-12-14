package sk.midnightnoon.simpleormframework.dbaccess;

import sk.midnightnoon.fiktivnyprogram.entity.Film;
import sk.midnightnoon.simpleormframework.exceptions.AnnotationMissingException;
import sk.midnightnoon.simpleormframework.reflection.ObjectReflector;
import sk.midnightnoon.simpleormframework.sql.SqlBuilder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class SormManager {
    public <T> T getEntityById(Long id, Class<T> clazz) throws Exception {

        T o = null;

        if(id == null){
            throw new IllegalArgumentException("ID nemoze byt prazdne");
        }

        if(!ObjectReflector.isTable(clazz)) {
            throw new AnnotationMissingException("Objekt nema anotaciu Tabulka.");
        }else {
            System.out.println("Is table: " + clazz.getName());
        }

        //nacitaj data z databazy
        ResultSet result = loadData(id, clazz);
        System.out.println(result.getString("ADDRESS"));
        
        //nasetuj na objekt
        o = ObjectReflector.getFilledData(result, clazz);

        return o;
    }

    private <T> ResultSet loadData(Long id, Class<T> clazz) throws Exception {
        String tableName = ObjectReflector.getTableName(clazz);
        List<String> tableColumns = ObjectReflector.getColumnNames(clazz);
        String idColumnName = ObjectReflector.getIdColumnName(clazz);

        String query = SqlBuilder.buildQuery(id, tableName, idColumnName, tableColumns);
        System.out.println(query);

        //ziskat result set
        DatabaseAccess databaseAccess = null;
        ResultSet rs = null;

        try{
            databaseAccess = new DatabaseAccess();
            rs = databaseAccess.executeQuery(query);
            databaseAccess.commit();
        }catch (Exception e){
            if(databaseAccess != null){
                databaseAccess.rollBack();
            }
            throw new Exception(e);
        } finally {
            if(databaseAccess != null){
                databaseAccess.disconnect();
            }
        }

        return rs;
    }

    public <T> void insertEntity(T object) throws Exception {
        Class<?> clazz = object.getClass();
        String tableName = ObjectReflector.getTableName(clazz);
        List<String> tableColumns = ObjectReflector.getColumnNames(clazz);

        Map<String, Object> data = ObjectReflector.getObjectData(object);

        String query = SqlBuilder.buildInsertQuery(tableName, tableColumns, data);

        DatabaseAccess databaseAccess = new DatabaseAccess();
        databaseAccess.insert(query);
    }
}
