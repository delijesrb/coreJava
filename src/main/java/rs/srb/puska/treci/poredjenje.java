package rs.srb.puska.treci;

import java.util.Scanner;

public class poredjenje {
    public static void main(String[] args) {
        System.out.println("unesi prvi broj");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("unesi drgi broj");
        int number2 = new Scanner(System.in).nextInt();

        boolean comparisonResult= number1==number2;
        if (number1==number2){
            System.out.println("uneseni Brojevi su jednaki");
        }
        if (number1!=number2){
            System.out.println("uneseni brojevi su nejednaki");
        }
        if (number1 >number2){
            System.out.println("prvi broj je veci od drugog");
        }
        if (number1 >= number2){
            System.out.println("prvi broj veci ili jednak drugom broju");

        }
        if (number1<number2){
            System.out.println("prvi broj manji od drugog");

        }
        if (number1<=number2){
            System.out.println("prvi broj manji ili jednak drugom");
        }
    }
}
