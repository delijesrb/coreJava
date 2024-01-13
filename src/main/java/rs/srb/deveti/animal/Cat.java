package rs.srb.deveti.animal;

import java.time.LocalDate;

public class Cat extends Animal{

    public Cat(String micika, String black, LocalDate god) {
        super();
    }

    @Override
    public void playSound() {
        System.out.println("Mjau Mjau.....");
    }
}
