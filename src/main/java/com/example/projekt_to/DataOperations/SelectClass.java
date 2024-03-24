package com.example.projekt_to.DataOperations;

import java.util.ArrayList;
import java.util.List;

public class SelectClass {
    private String tableName;
    private List<String> columnName;

    public SelectClass() {
        this.columnName = new ArrayList<>();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void addColumn(String nazwa){
        this.columnName.add(nazwa);
    }

    @Override
    public String toString() {
        String returnetString="Select ";
        if(columnName.isEmpty())
            returnetString+="* ";
        else {
            for (int i = 0; i < columnName.size() - 1; i++)
                returnetString += columnName.get(i) + ", ";
            returnetString += columnName.get(columnName.size()-1) + " ";
        }

        returnetString+="from "+tableName;
        return returnetString;
    }
}
