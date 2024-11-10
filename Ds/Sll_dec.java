public class Sll_dec {
    public static void main(String[] args) {
        Sll_dec sl = new Sll_dec();
        sl.head = new ListNode(10);
        ListNode sec = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fouth = new ListNode(40);
        sl.head.next = sec;
        sec.next = third;
        third.next = fouth;
        fouth.next = null;
        sl.display();
    }
    public void display(){
        ListNode currNode = head;
        while ( currNode != null) {
            System.out.print(currNode.data +"---->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    private ListNode head;
    private static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

}

