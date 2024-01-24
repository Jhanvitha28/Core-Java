package strings_concept;
import java.lang.StringBuffer;
public class Reverse {
    public static void main(String[] args){
        Reverse wr=new Reverse();
        String s="Java J2EE Reverse Me";
        String[] s1=s.split("\\s");
        for(int i=0;i<s1.length;i++) {
            StringBuffer sb = new StringBuffer(s1[i]);
            sb.reverse();
            s1[i]=sb.toString();
            System.out.print(s1[i]+" ");
        }
    }
}