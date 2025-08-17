package prctice;

import java.util.Scanner;

public class WriteAlphabets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter your character");
        char a=sc.next().charAt(0);

        for(char i=a;i<='Z';i++ ){
            System.out.println(i);
        }
    }
}
