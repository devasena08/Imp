import java.util.*;
public class Notes_stc {
    public static void main(String[] args) {
        Stack<String> stc = new Stack<>();
        stc.push("Deva");
        stc.push("sena");
        stc.push("Niruthi");
        stc.push("Shree");
        
        stc.push("Kpds");
        // this is wrg statement stc.pop("Kpds");
        stc.pop();
        System.out.println(stc);
        System.out.println(stc.empty());
        // returns true (if it does not have elements) or false  (if it have elements) 
        
	    System.out.println(stc.search("Deva")); //deva dhn first potathu,so keela irkum 4 th place la
        System.out.println(stc.peek()); // last ah pota element (i.e)mela irkum...peek la
    }
}
