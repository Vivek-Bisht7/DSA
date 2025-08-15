class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head , fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

     public ListNode reverseList(ListNode head) {

        ListNode previous = null;
        ListNode curr = head;

        while(curr!=null){
            
            ListNode nodenext = curr.next;

            curr.next = previous;
            previous = curr;

            curr = nodenext;
        }

        return previous;
    }

    public int pairSum(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode reversed = reverseList(mid);

        int res = 0;

        while(reversed !=null){
            res = Math.max(res,(head.val+reversed.val));
            head = head.next;
            reversed = reversed.next;
        }

        return res;
    }
}