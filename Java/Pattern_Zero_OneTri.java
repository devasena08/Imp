public class Pattern_Zero_OneTri {
    public static void main(String[] args) {
        int n =4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) %2 == 0){
                    System.out.print("0 ");
                }else{
                    System.out.print("1 ");
                }
                
            }
            System.out.println();
        }
    }
}
