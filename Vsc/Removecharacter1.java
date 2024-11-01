public class Removecharacter1 {
    public static void main(String[] args) {
        //String s ="Asha is pretty today";
        String s ="Devasena";
        char target ='a';
        System.out.println(Remove(s, target));
    }
    static String Remove(String s, char target){
        // 1) change to lowercase
        String str = s.toLowerCase(); //asha...
        String ans =" ";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != target){
                ans += str.charAt(i);
            }
        }
        return ans;
        
    }
}
