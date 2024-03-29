package strings_concept;
import java.lang.String;

public class Vowels {

    public static int vowelCount(String s) {
        if(s==null){
            return 0;
        }
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Vowels nv = new Vowels();
        String s = "jhanvitha";
        int cnt = vowelCount(s);
        System.out.println(cnt);
    }
}