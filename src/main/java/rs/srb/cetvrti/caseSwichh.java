package rs.srb.cetvrti;

import javax.swing.*;

public class caseSwichh {
    public static void main(String[] args) {
        String dan =  JOptionPane.showInputDialog("unesi broj");
    int weekDay = Integer.parseInt(dan);
    String weekDayName ;
    switch (weekDay){
        case 1:
        weekDayName = "Monday";
            break;
        case 2:
            weekDayName= "Tuesday";
            break;
        case 3:
            weekDayName= "Wednesday";
            break;
        case 4:
            weekDayName= "Thursday";
            break;
        case 5:
            weekDayName= "fryday";
            break;
        case 6:
            weekDayName="Saturday";
            break;
        case 7:
            weekDayName= "sunday";
            break;
        default:
            weekDayName= "Incorrect  number";


    }JOptionPane.showMessageDialog(null,weekDayName);

}}
