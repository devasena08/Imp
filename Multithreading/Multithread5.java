public class Multithread5 {
    public static void main(String[] args) {
        ChildThd5 ct = new ChildThd5(); //thread kaana obj ah create panirkom
        System.out.println(ct.getState());//new state la irkum ipo...will check it
        ct.start();
        System.out.println(ct.getState());
        for(int i=1; i<=5; i++){
            System.out.println("MainThread "+i);
        }
        System.out.println(ct.getState());
    }
}
class ChildThd5 extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("ChildThread "+i);
        }
    }
}

