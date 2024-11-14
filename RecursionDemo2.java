public class RecursionDemo2 {
    int mul=1;
    public static void main(String[] args) {
        RecursionDemo2 rd = new RecursionDemo2();
        System.out.println(rd.Multi(1)+" is the Factorial");
    }
    public int Multi(int n){
        mul *= n;
        n ++;
        if(n <= 5){
            Multi(n);
        }
        return mul;
    }
}
