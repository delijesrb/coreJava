package rs.srb.deveti.animal;

import java.time.LocalDate;

public class CatDemo {
    public static void main(String[] args) {
        LocalDate god= LocalDate.of(1985,5,20);
        LocalDate dog= LocalDate.of(1999,5,12);
        Cat mica=new Cat("micika","black",god);
        Cat mica1=new Cat("macika","white",dog);

    }
}
