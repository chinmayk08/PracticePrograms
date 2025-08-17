package prctice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findduplicate {
    public static void main(String[] args) {

// find duplicate value--
        List<String> a=new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("a");
        Set<String> b=new HashSet<>();
        for(String word: a){
            if(!b.add(word)){
                System.out.println("duplicate is :" +word);
            }
        }
// reverse string----
        String abc="ABCD";
        String re= "";

       for(int i =abc.length()-1;i>=0;i--){
           re+=abc.charAt(i);
       }
        System.out.println("reverse is :"+re);

// string is palindrome--

        String ac= "maam";
        String r="";

        for(int i=ac.length()-1;i>=0; i--){
            r+=ac.charAt(i);
        }
        if (r.equals(ac)){
            System.out.println("is palindrome");
        }
        else {
            System.out.println("is not palindrome");
        }


//swap two numbers--


        int x=10;
        int y=20;

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("x= "+x+" ,y= "+y);

//reverse number-

        int p=1234;
        int rev=0;

        while (p!=0){
            int last=p%10;
            rev=rev*10+last;
            p=p/10;

        }
        System.out.println("reverse number is-"+rev);
    }
}
