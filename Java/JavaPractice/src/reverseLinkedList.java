public class reverseLinkedList {
    public static void main(String[] args) {
        // Create input array and enter inputs into Linked List
        int[] values = {0, 1, 2, 3};
        ListNode head = createLinkedList(values);

        // Print original Linked List
        System.out.print("Original List: ");
        printLinkedList(head);

        // Call reverseList function
        head = reverseList(head);

        // Print reversed Linked List
        System.out.println("");
        System.out.print("Reversed List: ");
        printLinkedList(head);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static ListNode createLinkedList(int[] values) {
        if(values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for(int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    public static void printLinkedList(ListNode head){
        ListNode current = head;
        while(current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { 
            this.val = val; 
        }
        ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; 
        }
    }
}
