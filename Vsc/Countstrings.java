public class Countstrings {
    public static void main(String[] args) {
        String str ="KAviyarasi";
        char target ='a';
        String s = str.toLowerCase();
        int count =0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == target){
                count ++;
            }
        }System.out.println(count);

    }
}
