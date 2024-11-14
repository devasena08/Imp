public class Recursion_rev {
    int ans=0;
    public static void main(String[] args) {
        Recursion_rev r = new Recursion_rev();
        System.out.println(r.rev(12345));
    }
    public int rev(int n){
        ans = ans *10 + n%10;
        n/=10;
        if(n != 0){
            rev(n);
        }
        return ans;
    
    }
}
