package com.example.projekt_to;

import com.example.projekt_to.DataOperations.DeleteClass;
import com.example.projekt_to.DataOperations.InsertClass;
import com.example.projekt_to.DataOperations.SelectClass;
import com.example.projekt_to.DataOperations.UpdateClass;

public class test {
    public static void main(String[] args) {
        InsertClass select =new InsertClass();
        select.setTableName("asd");
        select.addSet("qwerty","1");
        select.addWhere("maina",">","3");
        select.addWhere("maina2","<","0");
        System.out.println(select.toString());
    }
}
