package com.gaf.exemple;

//@Service
public class MyFirstClass {

    private String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello(){
        return ("Hello Fom The First Class ==> my Var = " + myVar);
    }

}
