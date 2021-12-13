package AbstractAndInterfaceTests;

import AbstractAndInterfaceTests.Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }


    @Override
    public String howToEat() {
        return "c.c";
    }
}
