public class Multithread10{
    public static void main(String[] args) throws InterruptedException {
        ClassTrd10 cd = new ClassTrd10();
        cd.start();
        cd.join();//cd obj wrk mudicha aprm dhn..main thread oda join panum and execute
        for(int i=1; i<=5; i++){
            System.out.println("MainTrd "+i);
        }
    }
}
class ClassTrd10 extends Thread{
    public void run(){
        
        for(int i=1; i<=5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("ChildTrd "+i);
        }
    }
}
