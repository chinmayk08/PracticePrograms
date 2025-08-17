package prctice;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        int a = 4;
        boolean isprime=true;

        if(a<=1){
            isprime =false;
        }
        for(int i=2;i<=a/2;i++){
         if(a%i==0){
             isprime=false;
         }
        }
        System.out.println("isprime? "+isprime);
    }

}
