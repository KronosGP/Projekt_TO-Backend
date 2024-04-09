package com.example.projekt_to.Table;

import java.util.List;

public class TableClass {
    private String TableName;
    private List<FieldClass> Fields;

    public TableClass(String TableName){
        this.TableName=TableName;
    }
    public void addField(FieldClass Field){
        Fields.add(Field);
    }

    public String getTableName() {
        return TableName;
    }

}
