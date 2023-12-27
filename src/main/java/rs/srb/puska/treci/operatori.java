package rs.srb.puska.treci;

import javax.swing.*;

/**
 *        <p>
 *        <li>sabiranje</li>
 *        <li>oduzimanje</li>
 *        <li>mnozenje</li>
 *        <li>deljenje</li>
 *        <li>modulo</li>
 *        </p>
 */
    public class operatori {
    public static void main(String[] args) {
    String number1 = JOptionPane.showInputDialog("Unesi broj:");
    int broj1 = Integer.parseInt(number1);
        System.out.println(broj1);
        String number2 = JOptionPane.showInputDialog("unesi drugi broj:");
        int broj2 = Integer.parseInt(number2);
        System.out.println(broj2);
        int suma= broj1+broj2;
        JOptionPane.showMessageDialog(null, "sabiranje:"+ suma);
        int razlika = broj1 - broj2;
        JOptionPane.showMessageDialog(null,"oduzimanje:"+ razlika);
        int mnozenje = broj1*broj2;
        JOptionPane.showMessageDialog(null,"mnozenje:"+mnozenje);
        int deljnnje = broj1 / broj2;
        JOptionPane.showMessageDialog(null,"deljenje:"+deljnnje);
        int modulo= broj1%broj2;
        JOptionPane.showMessageDialog(null,"modulo:"+ modulo);
    }
    }
