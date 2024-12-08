import java.util.*;
public class Zoho6 {
    public static void main(String[] args){
        String str1 ="one two three"; //Output: three two one
        String str2="";
        Stack<String> stc = new Stack<>();
        for(char ch : str1.toCharArray()){
            if(ch == ' '){
                stc.push(str2);
                str2 =" ";
            }else{
                str2 += ch;
            }
        }
        if(!str2.isEmpty()){
            stc.push(str2);
        }
        String rev ="";
        while(!stc.empty()){
            rev += stc.pop()+" ";
        }
        System.out.println(rev);
    }
}
