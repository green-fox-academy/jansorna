package com.greenfox.foxclub.services;

import com.greenfox.foxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoxService {

    private List<Fox> foxList;

    public FoxService() {
        this.foxList = new ArrayList<>();
        foxList = initializeListOfFoxes();
    }

    private List<Fox> initializeListOfFoxes() {
        foxList.add(new Fox("Mr.Green"));
        foxList.add(new Fox("Mr.Claw"));
        foxList.add(new Fox("Mr.Fur"));
        foxList.add(new Fox("Mr.Tail"));
        foxList.add(new Fox("Mr.Wise"));

        return foxList;
    }

    public void addFoxToFoxList (Fox addedFox){
        this.foxList.add(addedFox);
    }

    public boolean ifFoxAlreadyExists(String name){
        return foxList.stream()
                .map(a -> a.getName())
                .collect(Collectors.toList()).contains(name);
    }

    public Fox findTheCorrectFox(String name){
        List<Fox> theChosenFoxList = foxList.stream()
                .filter(a -> a.getName().equals(name))
                .collect(Collectors.toList());
        return theChosenFoxList.get(0);
    }
}
