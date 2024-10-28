public class Day3 {
    public static void main(String[] args) {
        //trim
        String str ="     Hardwork Never Fails     ";
        int start =0;
        int end = str.length()-1;
        boolean s = false;
        boolean e = true;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' ' && s == false){
                start++;
            }else{
                s = true;
            }
            if(str.charAt(end)==' ' && e == false){
                end--;
            }else{
                e = true;
            }
            if(s == true && e == true){
                break;
            }
        }
        for(int i=start; i<=end; i++){
            System.out.print(str.charAt(i));
        }
    }
}
