public class Fern8 {
    public static void main(String[] args) {
        String st1 ="madam";
        String st2 ="aammd";

        String st3 =st2; //aammd
        for(int i=0; i<st1.length(); i++){
            for(int j=0; j<st2.length(); j++){
                if(st1.charAt(i) == st2.charAt(j)){
                    st3=st3.replaceFirst(Character.toString(st1.charAt(i)),"");
                }
            }
        }
        if(st3.isEmpty()){
            System.out.println("it is anagram..");
        }else{
            System.out.println("No it is not..");
        }
    }
}
