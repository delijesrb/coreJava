package rs.srb.sesti.loop;

import javax.swing.*;

public class breakDemo2 {
    public static void main(String[] args) {
        int[] broj={32,87,589,13,23,107876,2000,6222,12};
        int n=0;
        boolean nasao= false;
        int uneseniBroj;
        while (true){
            String unos = JOptionPane.showInputDialog("Unesi srecni broj:");
            uneseniBroj = Integer.parseInt(unos);
            n++;
            for (int i = 0; i <broj.length; i++) {

            if (broj[i] == uneseniBroj) {
                nasao=true;
                break;
            }

            }

            if (nasao){
                break;
            }
    }String message = "Pogodio si iz " + n + "-tog pokusaja " + uneseniBroj+ " je tvoj srecni broj";
        System.out.println(message);
}}
