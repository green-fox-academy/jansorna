package main.java.animals;

public abstract class Animal {
    String name;
    int age;
    String gender;
    int size;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String breed();

    public abstract String cry();
}
