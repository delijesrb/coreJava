package rs.srb.deveti.animal;

import rs.srb.deveti.Flyable;

public class Bird extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("Ptica leti");
    }

    @Override
    public void playSound() {
        System.out.println("ciu ciu");
    }
}
