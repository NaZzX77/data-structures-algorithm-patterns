package SlowAndFastPointers;
//https://leetcode.com/problems/linked-list-cycle-ii/
//already defined in LinkedListCycle so can just use it here.
//public class ListNode{
//    int val;
//    ListNode next;
//    ListNode(int x) {
//        val = x;next = null;
//    }
//}
public class LinkedListCycle2 {
    static void main(String[] args) {
        //when cycle does not exist
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        System.out.println(detectCycle(head));
        //to test when cycle exists
        ListNode first = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // cycle

        System.out.println(detectCycle(first).val);
    }
    public static ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                return startNode(slow,fast);
            }
        }
        return null;
    }
    public static ListNode startNode(ListNode slow,ListNode fast){
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
