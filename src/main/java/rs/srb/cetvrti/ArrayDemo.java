package rs.srb.cetvrti;

import javax.swing.*;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        String profinUnos = JOptionPane.showInputDialog("unesi broj poena:");
        char ocena;
        int brojPoena = Integer.parseInt(profinUnos);
        if (brojPoena >= 90) {
            ocena = 'A';
        } else if (brojPoena >80) {ocena = 'b';

        } else if (brojPoena > 70) {
            ocena = 'c';
        } else if (brojPoena > 60) {
            ocena= 'D';
        }else ocena = 'F';
        String mesage = "Ocena=" + ocena;
        JOptionPane.showMessageDialog(null, mesage);
    }
}