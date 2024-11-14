public class Multithread4 {
    public static void main(String[] args) {
        ChildThd4 ct = new ChildThd4(); //thread kaana obj ah create panirkom
        System.out.println(ct.getState());//new state la irkum ipo...will check it
        
    }
}
class ChildThd4 extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("ChildThread "+i);
        }
    }
}

