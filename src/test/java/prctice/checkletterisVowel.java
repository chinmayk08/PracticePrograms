package prctice;

import java.util.Scanner;

public class checkletterisVowel {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your letter:");
        String a=sc.next();
        a=a.toLowerCase();
        if(a.equals("a")||a.equals("e")||a.equals("i")||a.equals("o")||a.equals("u")){
            System.out.println("Given letter is Vowel");
        }
        else{
            System.out.println(" Given letter is consonant");
        }
    }
}
