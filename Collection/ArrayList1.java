import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer>  al1 = new ArrayList<>();
        al1.add(10);  //10
        al1.add(0,5); //5,10
        System.out.println(al1);//5,10
        al1.addFirst(1);//1,5,10 
        System.out.println(al1);//1,5,10 
        al1.addLast(100);//1,5,10,100
        System.out.println(al1);//1,5,10,100
        al1.remove(1);//1,10,100
        System.out.println(al1);//1,10,100
        al1.removeFirst();//10,100
        System.out.println(al1);//10,100
        al1.removeLast();//10
        System.out.println(al1);//10
        
        /* add, remove, addfirst,removefirst, addlast, removelast
[5, 10]
[1, 5, 10]
[1, 5, 10, 100]
[1, 10, 100]
[10, 100]
[10]
*/
    }
}
