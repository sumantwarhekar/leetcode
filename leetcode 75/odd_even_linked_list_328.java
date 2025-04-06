// 1st Approach : Optimised and easy to understand
class Solution {                                                    https://www.youtube.com/watch?v=WoUAs7R3Ao4
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return null;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenStart = even;

        while(even!=null && even.next!= null){
            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenStart;
        return head;
    }
}

// 2nd Approach: Exchanging odd and even elements
class Solution2 {                                                   https://www.youtube.com/watch?v=FsgS7lvk2cU
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenStart = even;

        while(odd.next!=null && even.next!=null){
            odd.next = even.next;
            odd = even.next;
            if(odd!=null){
                even.next = odd.next;
                even = odd.next;
            }
        }

        odd.next = evenStart;
        return head;        
    }
}
