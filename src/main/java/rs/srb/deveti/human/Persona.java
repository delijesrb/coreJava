package rs.srb.deveti.human;

import rs.srb.deveti.animal.Animal;
import rs.srb.deveti.animal.Duck;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String name;

    public LocalDate getBirthday() {
        return birthday;
    }

    private String surname;
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        Period period = birthday.until(today);
        System.out.println("years: "+ period.getYears());
        System.out.println("month: "+ period.getMonths());
        System.out.println("days : "+ period.getDays());
        return period.getYears();


    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    private LocalDate birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }




    }

