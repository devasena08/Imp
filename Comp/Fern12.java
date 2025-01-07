public class Fern12 {
    public static void main(String[] args) {
        //first non repeating letter
        String str = "swiss";
        String s = str.toLowerCase();//swiss
        for (int i = 0; i < str.length(); i++) { //s //w--->it goes like this
            int count = 0;//used to reset the count to zero
            for (int j = 0; j < str.length(); j++) {//s,w,i,s,

                if (s.charAt(i) == s.charAt(j) && i!=j) { // i!=jfails,fails,fails,satis
                    count++; //s,w,i,s(1),s(2)
                }
                
            }
            if (count == 0) {
                System.out.println(str.charAt(i));
                break;
            }

        }
    }
}
