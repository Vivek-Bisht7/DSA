// T.C. => O(2N)   S.C. => (1)

class Solution {
    public ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;

        ListNode nodeToBeDeleted = middleNode(head);

        nodeToBeDeleted = nodeToBeDeleted.next;

        return head;
    }
}

// T.C. => O(N)   S.C. => (1)

class Solution {
    public ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prev;
    }

    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;

        ListNode previousNode = middleNode(head);

        previousNode.next = previousNode.next.next;

        return head;
    }
}