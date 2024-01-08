package rs.srb.puska.treci;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class test {
    public static void main(String[] args) {
        System.out.println("unesi dan");
      int weekDayNumber = new Scanner(System.in).nextInt();
      String day_names ="";
      switch (weekDayNumber){
          case 0:
              day_names = " ponedeljak,";
          case 1:
              day_names = day_names+" utorak,";
          case 2:
              day_names = day_names+" sreda,";
          case 3:
              day_names =day_names+" cetvrtak,";
          case 4:
              day_names = day_names+" petak,";
          case 5:
              day_names = day_names+ " subota,";
          case 6 :
              day_names = day_names +" nedelja.";
              break;
          default:
              day_names = "greska";

      }
        System.out.println("dani su: " + day_names);





}}
