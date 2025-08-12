
class Solution {
    public ListNode reverseList(ListNode head) {

        // previous keeps the reversed linked list
        ListNode previous = null;

        // the current visiting node
        ListNode curr = head;

        while(curr!=null){

            // storing the next of the current node as it is going to be part of reversed ll and the its next could get completely lost
            ListNode nodenext = curr.next;

            // in this point we make the current node part of reversed ll
            curr.next = previous;
            previous = curr;

            // moving ahead in the original ll
            curr = nodenext;
        }

        return previous;
    }
}