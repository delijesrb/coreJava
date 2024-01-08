package rs.srb.sesti.loop;

import java.util.Scanner;

public class dvodimenzionalni {
    public static void main(String[] args) {
        int [][]dvoDimNiz = {
                {32,87,3,589},
                {121,123,13514,15},
                {622,127,77,955}
        };
       boolean nasao = false;
        System.out.println("unesi srecni brpj: ");
        int broj= new Scanner(System.in).nextInt();
       UCIONICA: for (int i = 0; i < dvoDimNiz.length; i++) {
            int niz[] = dvoDimNiz[i];
            for (int j = 0; j < niz.length; j++) {
            int number = niz[j];
            if(number == broj){
                nasao = true;
                break UCIONICA;
            }
            }


        }System.out.println(nasao ? "Pogodak": "greska");
    }
}
