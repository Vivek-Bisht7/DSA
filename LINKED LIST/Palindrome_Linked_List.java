class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nodenext = curr.next;
            curr.next = previous;
            previous = curr;
            curr = nodenext;
        }

        return previous;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head , fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public boolean isPalindrome(ListNode head) {
        ListNode middle = middleNode(head);
        ListNode reversed = reverseList(middle);

        ListNode temp = head;
        ListNode tempr = reversed;

        while(tempr != null){
            if(temp.val != tempr.val) return false;
            temp = temp.next;
            tempr = tempr.next;
        }

        return true;
    }
}