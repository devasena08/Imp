public class StrFun {
    public static void main(String[] args) {
        String str ="Devasena";
        String s ="sena";
        // to check  2 str are equal
        if(str.equals(s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        // to check  str...starts with 
        if(str.startsWith("Dev")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        // to check  str...ends with 
        if(str.endsWith("na")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        // to check  iruka ilaya
        if(str.contains(s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
