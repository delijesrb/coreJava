package rs.srb.sesti.loop;

import java.util.Scanner;

public class continueDemo2 {
    public static void main(String[] args) {
        System.out.println("unesi recenicu :");
        String recenica = new Scanner(System.in).nextLine();
        char slovo = 'p';
        char[] nizrecenice = recenica.toCharArray();
        int brojPonavljanja = 0;
        for (int i = 0; i < recenica.length(); i++) {
            char slovoRecenice = nizrecenice[i];
            if (slovo == slovoRecenice) {

                brojPonavljanja++;
            }


        } System.out.println(brojPonavljanja);
    }
}
