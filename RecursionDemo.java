public class RecursionDemo{
    public static void main(String[] args) {
        Rec(1);
    }
    public static void Rec(int n){
        if(n <= 5){ //1 //2 //3 //4 //5 //6<=5 cond fails comes out
            System.out.println(n); // print akum --> 1 2 3 4 5 
            n++; //2 3 4 5 6
            Rec(n);//call akuthu 1Time,2T, 3T, 4T, 5T
        }
    }
    
}
