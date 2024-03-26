package com.example.projekt_to.DataOperations;

import java.util.ArrayList;
import java.util.List;

public class SelectClass extends OperationClass{

    public SelectClass() {

    }

    public void addColumnName(String nazwa){
        addColumn(nazwa);
    }

    @Override
    public String toString() {
        String returnetString="Select ";
        List<String> columnName=getColumnName();
        if(getColumnName().isEmpty())
            returnetString+="* ";
        else {
            returnetString+=getColumnsString()+" ";
        }

        returnetString+="from "+getTableName();
        return returnetString;
    }
}
