class Solution {
    public int count(ListNode head){
        int nodes = 0;

        ListNode temp = head;

        while(temp!=null){
            nodes++;
            temp = temp.next;
        }

        return nodes;
    }

    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || k==0) return head;

        int length = count(head);

        // Making tail point to head

        ListNode temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = head;

        // calculating break point 

        int moves = length - (k % length);

        temp = head;

        while(--moves>0){
            temp = temp.next;
        }
        //new head
        head = temp.next;
        //new tail
        temp.next = null;

        return head;

    }
}