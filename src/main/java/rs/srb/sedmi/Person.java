package rs.srb.sedmi;

public class Person {
    private String name;
    private String surname;
    private int age;
    private static int caunter = 0;



    public Person(String ime,String Prezime){
        this(ime,Prezime,0);
    }


    public Person(String ime,String Prezime,int age){
        this.name =ime;
        this.surname=Prezime;
        this.age=age;
        caunter++;
    }

    public static int getCaunter(){
        return caunter;
    }



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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
