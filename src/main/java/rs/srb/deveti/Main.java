package rs.srb.deveti;

import rs.srb.deveti.animal.Dog;
import rs.srb.deveti.human.Persona;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Persona e1=new Persona();
        LocalDate birthday= LocalDate.of(1988,2,7);
        e1.setBirthday(birthday);
        e1.setName("edo");
        e1.setSurname("puska");
        movie film=new movie();
        film.setDirector("Quentin Tarantino");
        film.setRating(120);
        film.setRating(9);
        film.setTitle("Good Felas");
        Persona e2 = new Persona();
        LocalDate godina = LocalDate.of(1965,12,31);
        e2.setBirthday(godina);
        e2.setName("zoki");
        e2.setSurname("moj");
        System.out.println("persona 1: " + e2.getAge());
        System.out.println("persona 2 :" + e1.getAge());
Dog kuca=new Dog();
        e1.setAnimal( kuca);
        }



    }

