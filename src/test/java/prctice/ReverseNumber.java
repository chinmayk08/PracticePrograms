package prctice;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        int rev=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int original=a;
        while(a!=0){
            int last=a%10;
            rev=rev*10+last;
            a=a/10;
        }
        System.out.println("reverse is: "+rev);
        if(original==rev){
            System.out.println("is palindrome");
        }
        System.out.println(rev);
    }
}
