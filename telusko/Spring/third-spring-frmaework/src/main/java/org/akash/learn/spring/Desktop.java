package org.akash.learn.spring;

public class Desktop implements Computer {
    @Override
    public void compile(){
        System.out.println("Compiling in Desktop");
    }
}
