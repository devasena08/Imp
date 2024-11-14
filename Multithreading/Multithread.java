public class Multithread {
    public static void main(String[] args) {
        Childcls m = new Childcls(); // m is a child class obj
        // which can access all the parent cls(thread) method
        m.run();
        
    }
}
class Childcls extends Thread{
    public void run(){ //thread class have run and start method
        //both are non static methods....so, create obj to access it
        for(int i=1; i<=10; i++){
            System.out.println("Child Thread "+i);
        }
    }
}
