package Farm;

public class Animal {
    int hunger = 50;
    int thirsty = 50;
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        hunger--;
    }

    public void drink() {
        thirsty--;
    }

    public void play() {
        hunger++;
        thirsty++;
    }

    @Override
    public String toString() {
        return (name + " - hunger: " + hunger + " - thirty: " + thirsty);
    }
}
