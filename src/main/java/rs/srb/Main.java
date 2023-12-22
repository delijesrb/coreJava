package rs.srb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int user1;
       user1=2;
        System.out.println("User Login : "+ user1);
       int regularUser=1;
       int adminUser=2;
       int superAdmin=4;
   boolean res = regularUser == user1;
        System.out.println("Regular User Login:" + res);
        boolean res1 = adminUser == user1;
        System.out.println("Admin User Login: "+ res1);
        boolean res2 = superAdmin == user1;
        System.out.println("Superadmin User Login: "+ res2);
        System.out.println("Unesi Broj:");
        int variable = new Scanner(System.in).nextInt();
        int rest = variable % 2;
        boolean even =  rest==0;
        System.out.println("Variable it even " +even );
        int[] arrey = new int[8];
        System.out.println(arrey[4]);
    }
}