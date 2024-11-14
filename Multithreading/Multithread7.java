public class Multithread7 {
    public static void main(String[] args) {
        ChildThr7 ch = new ChildThr7();
        System.out.println(ch.getName());
        System.out.println(ch.getPriority());//default
        ch.setName("Deva");
        System.out.println(ch.getName());
    }
    
}
class ChildThr7 extends Thread{
    public void run(){
        System.out.println("Imp..");
    }
}