public class Ef1 {
    //rotate string
    public static void main(String[] args){
        String s ="abcde";
        String c ="cdeab";
        System.out.println(Method(s,c));
    }
    public static  boolean Method(String s, String c){
        String ans = s+s;//ab(cdeab)cde
        return ans.contains(c); //true irkum default ah..return akati false
    }
}
