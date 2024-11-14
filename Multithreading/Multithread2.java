public class Multithread2 {
    public static void main(String[] args) {
        ChildThd2 ct = new ChildThd2();
        ct.run();
        for(int i=1; i<=5; i++){
            System.out.println("MainThread "+i);
        }
    }
}
class ChildThd2 extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("ChildThread "+i);
        }
    }
}

/*
 * this is sequencial execution
 * single stack or single thread
 * bcz,...ore thread dhn main method ah call panuthu,...
 * athula iruka run ah call panuthu...
 * thn main la iruka for ah call panuthu
 */