public class Zoho3 {
    public static void main(String[] args){
        String str ="a3b10";
        StringBuilder res = new StringBuilder();
        
        int i = 0;
        while (i < str.length()) { //i=0, i=2
            char ch = str.charAt(i); //a,b
            i++; //1,3
            StringBuilder sb= new StringBuilder();
            while(i < str.length() && Character.isDigit(str.charAt(i))){ //str.charAt(1)=3 //2<5 && not digit
                sb.append(str.charAt(i)); //sb=3 //1
                i++; //i=2 //4
            }
            //conv to int
            int ans = Integer.parseInt(sb.toString()); //ans = 3 //10
            for(int j=0; j< ans; j++){ 
                res.append(ch);
            }
        }
        System.out.println(res);
    }
}
