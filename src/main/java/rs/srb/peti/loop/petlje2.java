package rs.srb.peti.loop;

import java.util.Scanner;

public class petlje2 {
    public static void main(String[] args) {
        int[] numbers = {12, 15, 654, 789, 78, 65, 46, 879, 65, 654};
        int sum=0;
        for (int i = 0; i< numbers.length; i++) {
          sum = sum + numbers[i];
        }
        System.out.println(sum);

    }
}
