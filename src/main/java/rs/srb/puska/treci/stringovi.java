package rs.srb.puska.treci;

import javax.swing.*;

public class stringovi{
    public static void main(String[] args) {
        String ime = JOptionPane.showInputDialog("Unesi Ime:");
        String prezime =JOptionPane.showInputDialog("Unesi prezime:");
        String rezultat = ime +" "+ prezime;
        String nemci = ime +","+ prezime;
        JOptionPane.showMessageDialog(null,nemci);
    }
}
