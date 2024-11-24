public class Fern17 {
    public static void main(String[] args) {
        String str ="     Hardwork Never Fails     ";
        int s =0;
        int e = str.length()-1;
        boolean st = true;
        boolean end = true;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' ' && st == true){
                s++;
            }else{
                st = false;
            }
            if(str.charAt(i)==' ' && end == true){
                e--;
            }else{
                end= false;
            }
            if( st == false && end == false ){
                break;
            }
        }
        for(int i=s; i<=e; i++){
            System.out.print(str.charAt(i));
        }
    }    

}
