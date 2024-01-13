package rs.srb.deveti;

import rs.srb.deveti.animal.Animal;
import rs.srb.deveti.animal.Duck;
import rs.srb.deveti.animal.Rabbit;
import rs.srb.deveti.human.Student;

public class Ljudi {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Student s1 = new Student();
        Rabbit r1 = new Rabbit();

        s1.setAnimal(duck);

        System.out.println(s1.getAnimal());

    }
}
