import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.println(ll);//1,2,3,4,5
        // remove is equal to poll
        System.out.println(ll.poll());// will remove the first index value---> 1
        System.out.println(ll);//2,3,4,5
        //offermenas adding
        ll.offer(500);//2,3,4,5,500
        System.out.println(ll); //2,3,4,5,500
        // clone
        //LinkedList<Integer> l2 = (LinkedList)ll.clone();
        //System.out.println(l2);
        // to clear all
        ll.clear();//l1 is got cleared
        System.out.println(ll);
        /*
[1, 2, 3, 4, 5]
1
[2, 3, 4, 5]
[2, 3, 4, 5, 500]
[]
*/
    }
}
