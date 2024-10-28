public class Ps3 {
    public static void main(String[] args) {
        int n =5;
        for(int i=1; i<=n; i++){
            for(int j = 2*(n-i); j>=1; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                if(i % 2 == 0){
                    System.out.print("# ");
                }else{
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
