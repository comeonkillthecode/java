package org.junit;

public class AssertExceptions{
    public int value (int value)throws Exception {
        if(value < 0){
            throw new IllegalArgumentException("You should pass positive number");
        }
        return value;
    }
}
