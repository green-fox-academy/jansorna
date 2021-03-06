package com.dependancy.injection.exercises.service.color.and.implementations;

import com.dependancy.injection.exercises.service.printer.Printer;
import org.springframework.beans.factory.annotation.Autowired;

//place for @Service
public class MyColorBlueImpl implements MyColor {

    @Autowired
    Printer myPrinter;

    @Override
    public void printColor(){
        myPrinter.log("It is blue in color!");
    }
}