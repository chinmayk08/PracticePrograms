package prctice;

public class countDigitsInNumber {


    public static void main(String[] args) {

        int number=456987;
        int count=0;
        //method 1
        /*String numberAsString = Integer.toString(number);
        int length = numberAsString.length();
        System.out.println("count is : "+length);
        */
        //method 2
        while(number!=0){
            number=number/10;
            count++;
        }
        System.out.println("count is : "+count);
    }
}
