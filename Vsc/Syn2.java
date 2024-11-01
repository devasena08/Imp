public class Syn2 {
    public static void main(String[] args) {
        String str="Devasena";
        char ch ='a';
        String s = str.toLowerCase();
        String rev =" ";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ch){
                rev += s.charAt(i);
                
            }
        }
        System.out.println(rev);

    }
}
