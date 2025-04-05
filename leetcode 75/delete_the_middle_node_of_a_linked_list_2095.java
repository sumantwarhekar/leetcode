import java.util.*;
// 1st Approach : Brute Force - Find middle and then change the connection for the node
class Solution {                                                https://www.youtube.com/watch?v=YfDp-VotVG4
    public ListNode deleteMiddle(ListNode head) {
        ListNode current=head;
        int length = 0;
        while(current!=null){
            length++;
            current = current.next;
        }

        if(length==1){
            return null;
        }

        int middle = length /2;
        current = head;
        for(int i=0;i<middle-1;i++){
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }
}

// 2nd Approach : Efficient Way - Use Slow and Fast pointers
class Solution {                                                https://www.youtube.com/watch?v=AKIXr5yIzKY
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode current = head;

        if(head==null || head.next==null){
            return null;
        }     

        while(fast!=null && fast.next!=null){
            current = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        current.next = slow.next;
        return head;
    }
}