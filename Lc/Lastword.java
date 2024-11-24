public class Lastword {
    public static void main(String[] args) {
        String str ="Deva is a beautiful girl";
        int count =0;
        for(int i=str.length()-1; i>=0; i--){
           
            if(str.charAt(i)==' '){
                break;
            }else{
                count++;
            }
        }
        System.out.println(count);
    }
}
