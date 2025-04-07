import java util.*;                                 https://www.youtube.com/watch?v=L4rNTY6j3JE
class Solution {                                    https://www.youtube.com/watch?v=3IN0BP9Ni6E
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;

        while(current != null){
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp; 
        }
        return previous;
    }
}