package com.example.projekt_to;

import com.example.projekt_to.DataOperations.DeleteClass;
import com.example.projekt_to.DataOperations.InsertClass;
import com.example.projekt_to.DataOperations.SelectClass;
import com.example.projekt_to.DataOperations.UpdateClass;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Sprawdź:\n" +
                "1. Select\n" +
                "2. Select+join\n" +
                "3. Select+join+where\n" +
                "4. Insert\n" +
                "5. Delete\n" +
                "6. Update\n" +
                "Wybierz:");
        Scanner myObj = new Scanner(System.in);
        Object test="asd";
        //System.out.println(test.getClass().getSimpleName());
        SelectClass select;
        switch (myObj.nextInt()) {
            case 1:
                select = new SelectClass();
                select.setTableName("asd");
                select.addColumnName("qwerty");
                System.out.println(select.toString());
                break;
            case 2:
                select = new SelectClass();
                select.setTableName("asd");
                select.addJoin("zxc", new String[]{"col1", "=", "col2"}, "Left Outer");
                select.addColumnName("qwerty");
                System.out.println(select.toString());
                break;
            case 3:
                select = new SelectClass();
                select.setTableName("asd");
                select.addJoin("zxc", new String[]{"col1", "=", "col2"}, "Left Outer");
                select.addColumnName("qwerty");
                select.addWhere("maina", ">", 3);
                select.addWhereConn(" or ");
                select.addWhere("maina2", "<", "0");

                SelectClass select2 = new SelectClass();
                select2.setTableName("asd");
                select2.addJoin("zxc", new String[]{"col1", "=", "col2"}, "Left Outer");
                select2.addColumnName("qwerty");
                select2.addWhere("maina", ">", select);
                System.out.println(select2.toString());
                break;
            case 4:
                InsertClass insert = new InsertClass();
                insert.setTableName("asd");
                insert.addSet("qwerty",22);
                insert.addSet("qwerty2",2);
                System.out.println(insert.toString());
                break;
            case 5:
                DeleteClass delete = new DeleteClass();
                delete.setTableName("asd");
                delete.addWhere("maina", ">", "3");
                delete.addWhereConn("and");
                delete.addWhere("maina2", "<", "0");
                System.out.println(delete.toString());
                break;
            case 6:
                UpdateClass update = new UpdateClass();
                update.setTableName("asd");
                update.addSet("zxc", 22);
                update.addWhere("maina", ">", "3");
                update.addWhereConn("or");
                update.addWhere("maina2", "<",22);
                System.out.println(update.toString());
                break;
        }
    }
}
