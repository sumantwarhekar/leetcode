class Solution {                                                            // https://www.youtube.com/watch?v=0ougDTvVOFI
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answer = new ListNode(Integer.MIN_VALUE);
        ListNode headNode = answer;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                answer.next = list1;
                list1 = list1.next;
            }
            else {
                answer.next = list2;
                list2 = list2.next;
            }
            answer = answer.next;
        }
        if(list1 == null)
            answer.next = list2;
        else if(list2 == null)
            answer.next = list1;

        return headNode.next;
    }
}