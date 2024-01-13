package rs.srb.osmi;

import rs.srb.osmi.in.Penzioner;
import rs.srb.sedmi.Person;

public class PersonDemo {

    public static void main(String[] args) {
  int caunter = Person.getCaunter();
        System.out.println(caunter);
        rs.srb.sedmi.Person p1 = new rs.srb.sedmi.Person("Ismet","Omerovic",26);
        rs.srb.sedmi.Person p2 = new rs.srb.sedmi.Person("mile","Vukajlovic",56);
        rs.srb.sedmi.Person p3 = new rs.srb.sedmi.Person("Nejra","Kadric");
        rs.srb.sedmi.Person p4 = new Person("Dafina","Radivojevic");
        System.out.println(Person.getCaunter());
        System.out.println(p2.getAge() + " "+ p2.getName()+" "+ p2.getSurname());
        p2.setName("Teodora");
        System.out.println(p2.getName());
        for (String arg: args){
            System.out.println("TO je:"+arg);
        }
        Penzioner prvi = new Penzioner("f","df",2);
        prvi.setPenzija("3500");
        System.out.println(prvi.getPenzija());
    }
}
