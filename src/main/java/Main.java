import java.util.Scanner;


public class Main {
    public static void main(String[] args){
      Calculator rezultat = new Calculator(15,5);
      System.out.println(rezultat.mnozenje());
        System.out.println(rezultat.sabiranje());
        System.out.println(rezultat.deljenje());
        System.out.println(rezultat.oduzimanje());
        System.out.println();
        Scanner srki = new Scanner(System.in);
        System.out.println("how old you are");
        String age = srki.next();
        System.out.println("Age " +age );
        
        double d= 12.2e5;

        System.out.println(d);
            }
        }