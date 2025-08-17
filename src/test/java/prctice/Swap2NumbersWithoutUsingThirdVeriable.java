package prctice;

import java.util.Scanner;

public class Swap2NumbersWithoutUsingThirdVeriable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your 1st number A=");
        int num1=sc.nextInt();
        System.out.println("enter your 2nd number B=");
        int num2=sc.nextInt();

        num1= num2+num1;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("swap numbers are:A= "+ num1);
        System.out.println("swap numbers are:B= "+ num2);

    }
}
