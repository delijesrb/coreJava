package rs.srb.osmi.in;

import rs.srb.osmi.Person;

public class Penzioner extends Person {

    private String penzija;




    public Penzioner(String ime, String prezime) {
        super(ime, prezime);

    }

    public Penzioner(String ime, String prezime, int age) {
        super(ime, prezime, age);
    }

    public Penzioner(int age) {
        super(age);
    }

    public Penzioner(String ime) {
        super(ime);
    }

    public String getPenzija() {
        return penzija;
    }

    public void setPenzija(String penzija) {
        this.penzija = penzija;
    }
}
