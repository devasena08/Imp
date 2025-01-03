public class Zoho3 {
    public static void main(String[] args){
        String str ="a3b10";//01234
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
/*
a3b10--->aaabbbbbbbbbb
using two sb
i=0, ch =a, i+=--->1
i=1, 1<5 & 3-->sb(3), i++---.2
i=2, 2<5 & b is not digit-->so omes out---.>
ans = sb(3) str to int --.a ns appeds aaain res
i=2<5 ch =b i++-->3
i=3, 3<5 && digit -->1
sb(1)--->1++--->i=4
i=4, 4<5 & digit(0)
sb(10)-->1++-->5
i=5, 5<5 .no it coms out

 *Mistakess i made..
while(i < str.length() && Character.isDigit(i)----> str.charAt(i)
System.out.println(sb); //tostring poten  
int ans = Integer.parseInt(s.toString());   ----.tostring  podala    


so..in general...
2 while cond
2 sb need

*/
