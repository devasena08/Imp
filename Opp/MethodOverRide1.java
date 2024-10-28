class MethodOverRide1{
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent c = new Child();
        p.Study();
        c.Study();
    }
}
class Parent{
    public void  Study(){
        System.out.println("our condition also present..");
    }
}
class Child extends Parent{
    public void  Study(){
        System.out.println("my own decision....");
    }
}