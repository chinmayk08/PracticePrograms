package prctice;



public class REverseWord {
    public static void main(String[] args) {
        String a="this is the time";
        //String [] words= a.split(" ");

        //for(String word: words){
            for(int i=a.length()-1;i>=0 ; i--)
            {
                System.out.print(a.charAt(i));

            }
            System.out.print(" ");

        //}
        }
    }


