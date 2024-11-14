public class Multithread8 {
    public static void main(String[] args) {
        ChildThd8 ct = new ChildThd8();
        ct.start();
        for(int i=1; i<=5; i++){
            System.out.println("MainThread "+i); //So, it alone want to execute
        }
    }
}
class ChildThd8 extends Thread{
    //non static method
    public void run(){
        Thread.yield(); //running la irunkarthu..runnable ku poidum-->So
        for(int i=1; i<=5; i++){
            System.out.println("ChildThread "+i);
        }
    }
}
/*
 * 
MainThread 1
ChildThread 1
MainThread 2 
ChildThread 2
MainThread 3 
MainThread 4 
ChildThread 3
ChildThread 4
ChildThread 5
MainThread 5 

epdi varum ans..bcz of multitasking in the os
ex:- school anuall day la..miss sending..stud to the stage....in any order
avga arrange pana mari illama ,,taknu send panvanga.,...same way, here within fraction of secs la..os vanthu 
jvm ku cpu kita irunthu time alllot panum...so, entha thread irko..athu anupichudum..running ku
 */