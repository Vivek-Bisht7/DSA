// :)

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        if(head.next==null) return head;

        ListNode head2 = head.next;
        ListNode temp1 = head;
        ListNode temp2 = head2;

        while(temp1!=null && temp1.next!=null && temp2!=null && temp2.next!=null){
            temp1.next = temp1.next.next;
            temp2.next = temp2.next.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp1.next = head2;

        return head;
    }
}