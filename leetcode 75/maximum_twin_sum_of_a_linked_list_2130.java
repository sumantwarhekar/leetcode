import java.util.*;
// 1st Approach: Optimal solution - using two points and reversing second half of the linked list
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode previous = null;
        ListNode current = slow;
        while(current!=null){
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        int maxSum=0;
        ListNode first = head;
        ListNode last = previous;
        while(last!=null){
            maxSum = Math.max(maxSum, first.val + last.val);
            first = first.next;
            last = last.next;
        }
        return maxSum;         
    }
}

// 2nd Approach: Store all the numbers in arraylist and then just apply two pointers method for sum and maxSum