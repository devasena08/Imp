public class MethodOverRide2 extends Sivakumar {//surya
    public static void main(String[] args) {
        MethodOverRide2 m = new MethodOverRide2();
        Sivakumar s = new Sivakumar();
        m.act();
        s.act();
    }
    void act(){
        System.out.println("Surya is acting..");
    }
}
class Sivakumar{
    void act(){
        System.out.println("Sivakumar is acting..");
    }
}
/*
 * 
 * whwn only one object is created..it doest not access Sk act
 * so, one object does not have multile forms here like..method overloading
 */