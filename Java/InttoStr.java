public class InttoStr{
    public static void main(String[] args) {
        int a =123;
        int b =456;

        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);

        String ans = str1+str2;
        System.out.println(ans);
    }
}