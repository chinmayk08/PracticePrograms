package prctice;

import java.util.Scanner;

public class SumofNaturalnumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int a=sc.nextInt();
        int sum = 0;
        for(int i=0; i<=a;i++){
            sum=sum+i;
        }
        System.out.println("Sum of your number is: "+sum);
    }
}
