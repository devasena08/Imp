public class Multithread3 {
    public static void main(String[] args) {
        ChildThd3 ct = new ChildThd3();
        //ct.run(); run ah access panama...
        ct.start(); //starts a new thread-->new thread craete akum
        for(int i=1; i<=5; i++){
            System.out.println("MainThread "+i);
        }
    }
}
class ChildThd3 extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("ChildThread "+i);
        }
    }
}

/*
 * this is parallel execution
 * 
 * 
ChildThread 1
MainThread 1
ChildThread 2
ChildThread 3
MainThread 2
ChildThread 4
ChildThread 5
MainThread 3
MainThread 4
MainThread 5
 * 
 * 
 * epdi mathi mathi print panum..
 */