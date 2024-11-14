public class Multithread9 {
    public static void main(String[] args) {
        ClassTrd9 cd = new ClassTrd9();
        cd.start();
        for(int i=1; i<=5; i++){
            System.out.println("MainTrd "+i);
        }
    }
}
class ClassTrd9 extends Thread{
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for(int i=1; i<=5; i++){
            System.out.println("ChildTrd "+i);
        }
    }
}
