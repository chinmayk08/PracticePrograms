package prctice;

import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {
        String a="silent";
        String b="listen";
        char[] ab=a.toCharArray();
        Arrays.sort(ab);

        char[] cd=b.toCharArray();
        Arrays.sort(cd);

        if (Arrays.equals(ab,cd)){
            System.out.println("both are anagrams");
        }else{
            System.out.println("both are not anagrams");
        }
    }
}
