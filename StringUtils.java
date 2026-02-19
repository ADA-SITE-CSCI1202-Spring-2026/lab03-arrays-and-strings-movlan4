package Week05;
public class StringUtils {
    public static String explodeStr(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= str.length(); i++) {
            res.append(str.substring(0, i));
        }
        
        return res.toString();
    }
    public static String sort(String str) {
        char[] chars = str.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }
    public static boolean Anagrams(String str1, String str2) {
        return sort(str1).equals(sort(str2));
    }
    public static String MixedStr(String str1){
        String[] words = str1.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            char[] c = words[i].toCharArray();
            char temp = c[0];
            c[0] = c[c.length - 1];
            c[c.length - 1] = temp;
            res.append(new String(c));
            if (i < words.length-1) {
                res.append(" ");
            }
        }
        return res.toString();
    }
    public static void isSubstr(String str1, String str2) {
        for(int i=0;i<=str1.length()-str2.length();i++){
            if(str1.substring(i,i+str2.length()).equals(str2)){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(-1);
    }
    public static void main(String[] args) {
        
    }
}