class Solution {
    public int count(ListNode head){
        int count = 1;
        ListNode temp = head;

        while(temp.next != null){
            count++;
            temp = temp.next;
        }

        return count;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = count(head);

        if(size==1) return null;

        int pos = size-n;

        ListNode temp = head;

        if(pos==0){
            return head.next;
        }

        for(int i=1; i<pos; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}