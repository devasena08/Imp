import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer>  al1 = new ArrayList<>();
        al1.add(10);
        al1.add(0,5);
        System.out.println(al1);
        al1.addFirst(1);
        System.out.println(al1);
        al1.addLast(100);
        System.out.println(al1);
        al1.remove(1);
        System.out.println(al1);
        al1.removeFirst();
        System.out.println(al1);
        al1.removeLast();
        System.out.println(al1);
        
        /* add, remove, addfirst,removefirst, addlast, removelast */
    }
}
