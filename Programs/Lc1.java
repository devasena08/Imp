import java.util.*;
public class Lc1{
	//valid paranthesis
  public static void main(String[] args){
	String str ="([]}())"; //([]{}())
	Stack<Character> stc = new Stack<>();
	if(str.isEmpty()){
	   System.out.println("null");
	}
	else{
	   for(char ch : str.toCharArray()){
	   if(ch =='{' || ch =='[' || ch =='('){
		stc.push(ch); 
	   }
	   else if(ch =='}' || ch ==']' || ch ==')'){
		if(ch =='}' && stc.peek() == '{'){
			stc.pop();
		}
		else if(ch ==')' && stc.peek() == '('){
			stc.pop();
		}
		else if(ch ==']' && stc.peek() == '['){
			stc.pop();
		}
		else{
		   break;
		}
	   }
	   
	}
	if(stc.empty()){
	    System.out.println("Valid Paranthesis..");
	}else{
	    System.out.println("InValid Paranthesis..");
	}
     }
	
  }
}