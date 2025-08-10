public class Solution {
    public int count(ListNode head){
        ListNode temp = head;
        int count = 1;

        while(temp.next != null){
            temp = temp.next;
            count++;
        }

        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = count(headA);
        int sizeB = count(headB);

        int diff = Math.abs(sizeA-sizeB);

        ListNode tempA = headA;
        ListNode tempB = headB;

        if(sizeA>sizeB){
            while(diff-->0){
                tempA = tempA.next;
            }
        }
        else{
            while(diff-->0){
                tempB = tempB.next;
            }
        }

        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA;
    }
}