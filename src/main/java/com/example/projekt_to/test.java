package com.example.projekt_to;

import com.example.projekt_to.DataOperations.SelectClass;

public class test {
    public static void main(String[] args) {
        SelectClass select =new SelectClass();
        select.setTableName("asd");
        select.addColumn("qwerty");
        select.addColumn("maina");
        select.addColumn("maina2");
        System.out.println(select.toString());
    }
}
