package prctice;

public class SumofDigits {


    public static void main(String[] args) {

        int a=465;
        int sum=0;
        while (a!=0){
            int last=a%10;
            sum=sum+last;
            a=a/10;
        }
        System.out.println(sum);
    }
}
