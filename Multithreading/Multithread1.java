public class Multithread1 {
    public static void main(String[] args) {
        Childcls1 m = new Childcls1(); // m is a child class obj
        // which can access all the parent cls(thread) method
        m.run();
        m.start();
        //entha obj vachu access panromo...antha class kula ula def dhn call panum
        //ex:- child class la namba ipo object create panirkmom,....and we hve only
        // run method...but we are calling start methid using child class obj
        //satrt method is in parent cls....but it will return the child class output
        //bcz,. we used child class obj to access it 
    }
}
class Childcls1 extends Thread{
    public void run(){ //thread class have run and start method
        //both are non static methods....so, create obj to access it
        for(int i=1; i<=10; i++){
            System.out.println("Child Thread "+i);
        }
    }
}
