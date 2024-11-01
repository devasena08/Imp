public class Syn3 {
    public static void main(String[] args) {
        //occurence of given character in a string
        String str ="Devasena";
        String s = str.toLowerCase();
        char c ='a';
        int count =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
        }System.out.println(count);
    }
}
