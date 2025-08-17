package prctice;

import java.util.Scanner;

public class checkEvenOdd {
    public static void main(String[] args) {
        Scanner st= new Scanner(System.in);

        System.out.println("Enter your number");
        int a=st.nextInt();

        if ((a%2==0)){
            System.out.println(a+" is even number");
        }
        else {
            System.out.println(a+" is odd number");
        }

    }
}
