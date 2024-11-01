public class TcLineat {
    public static int finSum1(int n){   // 1-->cons =1
        int sum =0; //2--->1
        for(int i=1; i<=n; i++){ //3 -->i=1-->1, i<=n;-->3(n+1), i++-----> 3n===>1+3(n+1)+3n ==>6n+4
            sum += i; // n steps // 4  ---->assign so, cons =1--->4n
        } //5
        return sum; //6  ---->2--->total ah O(n)
    }
    public static void main(String[] args) {
        System.out.println(finSum1(5));
    }
}
