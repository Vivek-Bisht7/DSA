class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0,null);

        ListNode temp1 = list1 , temp2 = list2 , temp = result;

        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                temp.next = new ListNode(temp1.val,null);
                temp = temp.next;
                temp1 = temp1.next;
            }
            else{
                temp.next = new ListNode(temp2.val,null);
                temp = temp.next;
                temp2 = temp2.next;
            }
        }

        while(temp1!=null){
                temp.next = new ListNode(temp1.val,null);
                temp = temp.next;
                temp1 = temp1.next;
        }
        while(temp2!=null){
                temp.next = new ListNode(temp2.val,null);
                temp = temp.next;
                temp2 = temp2.next;
        }

        return result.next;
    }
}