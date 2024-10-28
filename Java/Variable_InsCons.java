public class Variable_InsCons {
    String name;
    int salary;
    int age;

    Variable_InsCons(String name, int salary, int age){
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    public static void main(String[] args) {
        Variable_InsCons vr = new Variable_InsCons("Deva", 1000000, 23);
        System.out.println(vr.name);
        System.out.println(vr.salary);
        System.out.println(vr.age);
    }
}
