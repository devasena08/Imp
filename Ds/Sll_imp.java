public class Sll_imp {
    public static void main(String[] args) {
        Sll_imp sll = new Sll_imp();
        sll.head = new ListNode(10);
        ListNode sec  = new ListNode(1);
        ListNode third  = new ListNode(8);
        ListNode fourth  = new ListNode(11);
        sll.head.next = sec; // 10---->1
        sec.next = third;    //10----->1---->8
        third.next = fourth;//10----->1---->8----->11
        fourth.next = null;//10----->1---->8------->11---->null
        sll.display();
    }
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "----->");
            current = current.next;
        }
        System.out.println("null");
    }
    private ListNode head; //instance var
    private static class ListNode{ //node has 2 part
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null; //default
        }
    }
}
