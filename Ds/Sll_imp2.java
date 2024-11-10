public class Sll_imp2 {
    public static void main(String[] args) {
        ListNode head = null;
        
        // Insert nodes into the list
        head = Insert(head, 2);
        head = Insert(head, 4);
        head = Insert(head, 6);
        head = Insert(head, 8);
        head = Insert(head, 10);
        
        // Display the linked list
        display(head);
    }
    
    // ListNode class used to implement SLL
    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static ListNode Insert(ListNode head, int data) {
        ListNode newnode = new ListNode(data);
        newnode.next = head;
        head = newnode;
        return head;
    }
    
    public static void display(ListNode head) {
        ListNode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ----> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
}
