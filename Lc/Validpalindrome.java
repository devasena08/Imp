public class Validpalindrome {
    public static void main(String[] args) {
        String str ="Race a Car";
        String ans ="";
        String rev="";
        for(int i=0; i<str.length(); i++ ){
            if(str.charAt(i) != ' '){
                ans += str.charAt(i);
            }
        }
        String s = ans.toLowerCase(); //raceacar
        
        for(int i=s.length()-1; i>=0; i-- ){
            rev += s.charAt(i); //raceacar
        }
        
        if(s.equals(rev)) {
            System.out.println("Palindrome..");
        }else{
            System.out.println("Not a plaindrome..");
        }
        
    }
}
