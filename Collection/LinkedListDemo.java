import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.println(ll);
        // remove is equal to poll
        System.out.println(ll.poll());// will remove the first index value
        System.out.println(ll);
        //offer
        ll.offer(500);
        System.out.println(ll);
        // clone
        //LinkedList<Integer> l2 = (LinkedList)ll.clone();
        //System.out.println(l2);
        // to clear all
        ll.clear();
        System.out.println(ll);
    }
}
