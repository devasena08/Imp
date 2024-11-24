public class Prefix {
    public static void main(String[] args) {
        String str ="I love eating burger";
        String s ="burg";
        System.out.println(Pre(str, s));
    }
    public static int Pre(String str, String s){
        String str1[] = str.split(" "); //string to Array , enga split akutho...athu oru index ah str akum
        for(int i=0; i<str1.length; i++){
            if (str1[i].startsWith(s)) {
                return i+1;
            }
        }
        return -1;
    }
}
