package prctice;

public class PalindromCheck {
    public static void main(String[] args) {
        String a="iamai";
        String rev="";

        for(int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);
        }
        if(a.equals(rev)){
            System.out.println("is palindrome");
        }else{
            System.out.println("is not palindrome");
        }
    }
}
