package rs.srb.sesti.loop;

import javax.swing.*;

public class BreakDemo {
    public static void main(String[] args) {
        int[] broj={32,87,589,13,23,107876,2000,6222,12};
        String unos = JOptionPane.showInputDialog("Unesi srecni broj:");
        int uneseniBroj = Integer.parseInt(unos);
        boolean srecan = false;
        for (int i=0; i <broj.length;i++){
            if (broj[i]== uneseniBroj){
                srecan = true;
                break;
            }
        }String message = srecan ? "Cestitamo":"vise Srece drugi put";
        System.out.println(message);
    }}

