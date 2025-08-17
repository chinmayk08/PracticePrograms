package prctice;

public class fibonanciiii {

    public static void main(String[] args) {
        int n=10;
        int f=0;
        int s=1;
        int next=f+s;
        System.out.print(f +" "+s+" ");
        while(next<=n){
            System.out.print(next);
             f=s;
             s=next;
             next=f+s;
        }
    }
}


/*First two terms are always 0 and 1.

Every next term is the sum of the previous two. a+b=c, b+c=d

Continue until the next term exceeds N.*/