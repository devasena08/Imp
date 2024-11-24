import java.util.Arrays;

public class CommonPre {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        Arrays.sort(str); //flight, flow, flower
        String f =str[0]; //flight
        String l = str[str.length-1]; //flower
        int index=0;
        while (index<f.length()) { //0<6
            if(f.charAt(index) == l.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        System.out.println(f.substring(0, index));
    }
}

/*
 * Input: strs = ["flower","flow","flight"]
Output: "fl"
 */
