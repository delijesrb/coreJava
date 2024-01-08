package rs.srb.peti.loop;

import java.util.Scanner;

public class petlje {
    public static void main(String[] args) {
       int i=new Scanner(System.in).nextInt();

        do{
            System.out.println(i);
            i++;
        }while (i<=10);
    }
}
