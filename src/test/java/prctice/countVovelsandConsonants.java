package prctice;

public class countVovelsandConsonants {

    public static void main(String[] args) {

          String a="Hello";
          StringBuilder ab= new StringBuilder((a).toString().toLowerCase());

        System.out.println(ab);

        int vovelcount=0;
        int consonants=0;

        for(int i=0;i<=ab.length()-1;i++){
            char str=ab.charAt(i);
            if("aeiou".indexOf(str)!=-1){
                vovelcount++;
            }else {
                consonants++;
            }
        }
        System.out.println("vovels are: "+vovelcount+" and consonants are: "+consonants);
    }
}
