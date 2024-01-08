package rs.srb.peti;

import java.util.Scanner;

public class spojeniCase {
    public static void main(String[] args) {
        System.out.println("unesi redni broj meseca:");
        int monthNumber = new Scanner(System.in).nextInt();
        int numberDays =0 ;
        System.out.println("unesi godinu: ");
        int yearNumber = new Scanner(System.in).nextInt();
        if ((monthNumber <=0 ) || (monthNumber >=12)){
            System.out.println("greska");

        }else {

        switch (monthNumber){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberDays=30;
                break;
            case 2:
                if ((yearNumber%4==0) &&(yearNumber%100!=0)) {
                    numberDays=29;}
                else {numberDays = 28;}
                break;

                }
        System.out.println("broj dana u "+monthNumber + " mesecu " + "je "+  numberDays + " " + yearNumber+" godine.");
        }}

}

