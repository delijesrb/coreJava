package rs.srb.sesti.loop;

import javax.swing.*;
import java.util.Random;

public class breakDemo3 {
    public static void main(String[] args) {

        Random random = new Random();
        int brojevi[];
         brojevi= new int[11] ;
         for(int i=0; i <brojevi.length; i++){
             brojevi[i]=random.nextInt(1000);
             System.out.println(brojevi[i]);

         }
        System.out.println(brojevi[4]);
        int n=0;
        int uneseniBroj;
        Dafne :while (true){
            String unos = JOptionPane.showInputDialog("Unesi srecni broj:");
           uneseniBroj = Integer.parseInt(unos);
            n++;
            for (int i = 0; i <brojevi.length; i++) {
                int broj = brojevi[i];
                if (broj == uneseniBroj) {
                    break Dafne;
                }

            }

        }String message = "Pogodio si iz " + n + "-tog pokusaja " + uneseniBroj+ " je tvoj srecni broj";
        System.out.println(message);
    }}


