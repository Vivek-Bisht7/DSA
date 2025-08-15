// uses two pointer , efficient but could be better

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;

        ListNode temp1 = head;
        ListNode temp2 = head;

        while(temp2!=null && temp2.next!=null){
            if(temp2.val != temp2.next.val){
                temp2 = temp2.next;
                temp1.next = temp2;
                temp1 = temp1.next;
            }
            else{
                temp2 = temp2.next;
            }
        }

        temp1.next = null;

        return head;

    }
}

// uses one pointer but tc and sc same as above 

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null){
            while((temp.next != null) && temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }
}