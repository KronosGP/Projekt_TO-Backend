package com.example.projekt_to.DataOperations;

public class DeleteClass extends OperationClass{
    public DeleteClass() {
    }

    @Override
    public String toString() {
        String returnetString="Delete from "+getTableName();
        if(!getWhereStatemant().isEmpty())
            returnetString+=getWhereString()+" ";
        return returnetString;
    }
}
