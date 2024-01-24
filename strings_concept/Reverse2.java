package strings_concept;
public class Reverse2 {
    public static boolean isRotation(String s, String s1) {
        if(s==null||s1==null){
            return false;
        }
        if (s.length() == s1.length()) {
            String s3 = s + s;
            return s3.contains(s1);

        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Reverse2 sr=new Reverse2();
        String s = "hello";
        String s1 = "holla";
        System.out.println(isRotation(s,s1));
    }
}