public class Variable_s {

    static int n =5;  //bcz, it is class lvl variable 
    public static void main(String[] args) {
        //static int a =5; --->shows error
        System.out.println(n);
        //to access non static chumaa...create obj
        Variable_s obj = new Variable_s();
        obj.Chuma();

    }
    public void Chuma(){
        // static int a =10;
        
        System.out.println(n);
    }
}
//static variable is class variable
//only one copy of static variable stored in memory
//global variable it is
// it is created inside the class,..but outside method
