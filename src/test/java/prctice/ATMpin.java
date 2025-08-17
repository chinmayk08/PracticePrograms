package prctice;

import java.util.Scanner;

public class ATMpin {

    public static void main(String[] args) {
        int pin=1234;
        Scanner sc = new Scanner(System.in);
        int attempts=3;

        while (attempts>0){
            System.out.println("enter your pin: ");
            int a=sc.nextInt();
            if(a==pin){
                System.out.println("access granted");
                break;
            }
            else{
                attempts--;
                System.out.println("access denied. your attempts left:"+attempts);

            }
            if(attempts==0){
                System.out.println("your account is temporary blocked.Please try after some times...");
            }
        }
    }

}
