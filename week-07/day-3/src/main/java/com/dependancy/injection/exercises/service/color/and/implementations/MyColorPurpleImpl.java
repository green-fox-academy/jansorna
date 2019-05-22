package com.dependancy.injection.exercises.service.color.and.implementations;

import com.dependancy.injection.exercises.service.printer.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyColorPurpleImpl implements MyColor {

    @Autowired
    Printer myPrinter;

    @Override
    public void printColor() {
        myPrinter.log("It is purple in color!");
    }
}