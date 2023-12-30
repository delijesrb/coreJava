package rs.srb.cetvrti;

import javax.swing.*;

public class drugicase {
    public static void main(String[] args) {
        String weekDayName = JOptionPane.showInputDialog("enter week day:");
        int dayNamber;
        switch (weekDayName){
            case "monday":
                dayNamber =1;
                break;
            case "tuesday":
                dayNamber = 2;
                break;
            case "wednesday":
                dayNamber = 3;
                break;
            case "thursday":
                dayNamber = 4;
                break;
            case "friday":
                dayNamber = 5;
                break;
            case "saturday":
                dayNamber =6;
                break;
            case "sunday":
                dayNamber = 7;
                break;
            default: dayNamber = 555;
            JOptionPane.showMessageDialog(null,"error");

        }JOptionPane.showMessageDialog(null,"to je "+dayNamber+" dan u nedelji");
    }
}
