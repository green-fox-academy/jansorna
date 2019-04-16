package Animal;

public class Animal {
    int hunger = 50;
    int thirsty = 50;

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
}
