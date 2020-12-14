package sk.midnightnoon.simpleormframework.sql;

import java.util.List;
import java.util.Map;

public class SqlBuilder {
    public static String buildQuery(Long id, String tableName, String idColumnName, List<String> tableColumns) {

        StringBuilder stlpce = new StringBuilder();
        for(String s : tableColumns) {
            stlpce.append(s).append(",");
        }
        String stlpceQuery = stlpce.substring(0, stlpce.lastIndexOf(","));

        return String.format("SELECT %s FROM %s WHERE %s=%d", stlpceQuery, tableName, idColumnName, id);
    }

    public static String buildInsertQuery(String tableName, List<String> tableColumns, Map<String, Object> data) {
        String insertQuery = "";

        StringBuilder columnsNames = new StringBuilder();
        StringBuilder dataToInsert = new StringBuilder();

        for(String s : tableColumns){
            columnsNames.append(s);
            columnsNames.append(",");
            dataToInsert.append("'");
            dataToInsert.append(data.get(s));
            dataToInsert.append("'");
            dataToInsert.append(",");
        }

        String columnsFinal = columnsNames.substring(0,columnsNames.lastIndexOf(","));
        String dataFinal = dataToInsert.substring(0, dataToInsert.lastIndexOf(","));

        insertQuery = String.format("INSERT INTO %s (%s) VALUES (%s)", tableName, columnsFinal, dataFinal);

        return insertQuery;
    }
}
