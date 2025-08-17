package prctice;

public class primenumber50 {

    public static void main(String[] args) {
        for (int i=2; i<=50; i++){
            boolean isprime=true;
            for(int j=2; j<=i/2;j++){
                if (i%j==0){
                    isprime=false;
                    break;
                }
            }
            if (isprime) {
                System.out.print(i + "");
            }
        }

    }


}
