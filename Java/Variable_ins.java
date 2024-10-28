public class Variable_ins {
    String name ;
    int salary;
    int age;

    public void printEmp(String name, int salary,int age){
        System.out.println(name);
        System.out.println(salary);
        System.out.println(age);
    }
    public static void main(String[] args) {
        Variable_ins in = new Variable_ins();
        System.out.println("Emp Details Are:- ");
        
        in.printEmp(null, 0, 0);
        //printEmp( name,  salary); -->shows error bcz
        // non static method cant accessed without using object
        // instance variable will take default values
    }
}

