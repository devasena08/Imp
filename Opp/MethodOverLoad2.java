public class MethodOverLoad2 {
    public static void main(String[] args) {
        // System.out.println("2 Args : "+ add(2,3));-->shows error
        //bcz, since it is static..we dont want obj to access, but, it is in another class
        //when you want to access methods from another class, 
        //you need to specify the class name. Since your add methods are static
        System.out.println("2 Args : "+ M2.add(2,3));
        System.out.println("3 Args : "+ M2.add(2,3,4));

    }
    
}
class M2{
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b,int c){
        return a+b+c;
    }
}

