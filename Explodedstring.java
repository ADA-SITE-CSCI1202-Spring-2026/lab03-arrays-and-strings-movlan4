package Week05;
public class Explodedstring {
    public static String explodeStr(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= str.length(); i++) {
            res.append(str.substring(0, i));
        }
        
        return res.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(explodeStr("Baku"));
    }
}