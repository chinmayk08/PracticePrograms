package prctice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicateintarray {


    public static void main(String []args){
        int [] a={1,2,3,1};

        Set<Integer> ab=new HashSet<>();
        List<Integer> c=new ArrayList<>();

        for(int i =0; i<a.length;i++){
            if (!ab.add(a[i])){
                c.add(a[i]);
            }
        }
        System.out.println(c);
    }
}
