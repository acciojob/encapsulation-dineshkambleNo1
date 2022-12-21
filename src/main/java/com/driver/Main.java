package com.driver;

public class Main {
    public static void main(String[] args) {
        //crete an obj of class RWOnly in this file

        RWOnly rw = new RWOnly();

//        rw.name = "dinesh";
        // error : java: name has private access in com.driver.RWOnly;

        rw.setName("dinesh");

        //try, setting a value to name, by directly accessing it using obj and also try printing it


    }
}