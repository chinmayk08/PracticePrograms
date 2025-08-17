package prctice;

import java.util.Scanner;

public class TableofNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int a=sc.nextInt();
        System.out.println("your number table is:");
        for(int i=1; i<=10; i++){
            int b=a*i;
            System.out.println(a+"*"+i+"="+b);
        }
    }
}
