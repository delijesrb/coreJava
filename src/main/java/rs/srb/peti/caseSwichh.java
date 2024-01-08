package rs.srb.peti;

import javax.swing.*;

public class caseSwichh {
    public static void main(String[] args) {
    String weekDay = JOptionPane.showInputDialog("unesi dan");
    String weekdayLowwerCase0 = weekDay.toLowerCase();
        weekdayLowwerCase0 = switch (weekdayLowwerCase0) {
            case "ponedeljak" -> "monday";
            case "utorak" -> "tuesday";
            case "sreda" -> "wednesday";
            case "cetvrtak" -> "thursday";
            case "petak" -> "friday";
            case "subota" -> "saturday";
            case "nedelja" -> "sunday";
            default ->"incorrect";
        };
        JOptionPane.showMessageDialog(null,"week Day its "+weekdayLowwerCase0);
}}
