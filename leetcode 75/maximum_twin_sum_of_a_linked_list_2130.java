import java.util.*;
// 1st Approach: Optimal solution - using two points and reversing second half of the linked list
class Solution {                                        https://www.youtube.com/watch?v=KqmqU4TP860
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
class Solution2 {
    public int pairSum(ListNode head) {
        List<Integer> input = new ArrayList<>();
        ListNode current = head;

        while(current!=null){
            input.add(current.val);
            current = current.next;
        }

        int maxSum=0;
        int i=0;
        int j=input.size()-1;

        while(i<j){
            int currentSum = input.get(i) + input.get(j);
            maxSum = Math.max(currentSum,maxSum);
            i++;
            j--;
        }

        return maxSum;
    }
}