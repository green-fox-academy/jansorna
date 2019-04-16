package Animal;

public class Main {
    public static void main(String[] args) {

        // start of testing
        Animal monkey = new Animal();
        Animal elephant = new Animal();

        System.out.println(monkey.hunger);
        System.out.println(elephant.thirsty);

        monkey.eat();
        elephant.drink();

        System.out.println(monkey.hunger);
        System.out.println(elephant.thirsty);

        monkey.play();

        System.out.println(monkey.hunger);
        System.out.println(monkey.thirsty);
        //end of testing
    }
}
