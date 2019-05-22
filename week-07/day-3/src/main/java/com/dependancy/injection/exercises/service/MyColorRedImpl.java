package com.dependancy.injection.exercises.service;

import com.dependancy.injection.exercises.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//place for @Service
public class MyColorRedImpl implements MyColor {

    @Autowired
    Printer myPrinter;

    @Override
    public void printColor() {
        myPrinter.log("It is red in color!");
    }
}
