package rs.srb.osmi;

public class Main {
    public static void main(String[] args) {
        int number ;
        number = 34;
        System.out.println(number);
        int [] numbers= new int[3];
        numbers[0]=23;
        numbers[1]=34;
        numbers[2]=21;
        System.out.println(numbers[1]+ " a broj na drugom je "+ numbers[2]);
        Movie movie1= new Movie();
        movie1.setDirector("Quentin Tarantino");
        movie1.setTitle("Good Fellas");
        movie1.setDuration(146);
        movie1.setRating(90);
        Movie movie2 = new Movie();
        movie2.setDirector("Pjer Zalica");
        movie2.setTitle("Strik");
        movie2.setDuration(146);
        movie2.setRating(-10);
        System.out.println("Ocena filma: "+movie1.getRating()+"\r\nReziser:"+movie1.getDirector()+ "\r\nNaziv filma:"+movie1.getTitle()+"\nFilm traje "+ movie1.getDuration());
        System.out.println(movie2.getRating());
    }
}
