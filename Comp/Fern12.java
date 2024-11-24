public class Fern12 {
    public static void main(String[] args) {
        String str = "swiss";
        String s = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (s.charAt(i) == s.charAt(j) && i!=j) {
                    count++;
                }
                
            }
            if (count == 0) {
                System.out.println(str.charAt(i));
                break;
            }

        }
    }
}
