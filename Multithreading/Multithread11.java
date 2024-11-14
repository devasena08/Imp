public class Multithread11{
    public static void main(String[] args) throws InterruptedException {
        ClassTrd11 cd = new ClassTrd11();
        cd.start();
        cd.interrupt();
        for(int i=1; i<=5; i++){
            System.out.println("MainTrd "+i);
        }
    }
}
class ClassTrd11 extends Thread{
    public void run(){
        
        for(int i=1; i<=5; i++){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println("InterruptedException");
            }
            System.out.println("ChildTrd "+i);
        }
    }
}
/*
 * InterruptedException
ChildTrd 1
MainTrd 1
MainTrd 2
MainTrd 3
MainTrd 4
MainTrd 5
ChildTrd 2
ChildTrd 3
ChildTrd 4
ChildTrd 5   oru time mtm dhn interrupt panrom...adhn oru InterruptedException time avnthurku
 */