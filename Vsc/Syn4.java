public class Syn4 {
    public static void main(String[] args) {
        //longest word
        String str ="Deva is beatiful girl";
        String longest=" ";
        String currentword =" ";
        for(int i=0; i<str.length(); i++){
           char ch = str.charAt(i);

           if(ch !=' '){
                currentword += ch;
           }
           else{
                if(currentword.length()>longest.length()){
                    longest = currentword;
                }
                currentword=" ";
           }
          
        }System.out.println(longest);
    }
}
