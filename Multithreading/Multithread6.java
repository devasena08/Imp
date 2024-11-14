public class Multithread6 {
    public static void main(String[] args) {
        ChildThd6 ct = new ChildThd6(); //thread kaana obj ah create panirkom
        
        ct.setPriority(1);//naa main thread ku prio set panirken..so it will exe first
        ct.start(); 
        for(int i=1; i<=5; i++){
            System.out.println("MainThread "+i);
        }
        System.out.println(ct.getState());
    }
}
class ChildThd6 extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("ChildThread "+i);
        }
    }
}

 
