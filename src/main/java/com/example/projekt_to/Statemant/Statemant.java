package com.example.projekt_to.Statemant;

public class Statemant {
    private String columnName;
    private String value;
    private String sign;

    public Statemant() {

    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getString() {
        return  columnName+" "+ sign+" "+value;
    }
}
