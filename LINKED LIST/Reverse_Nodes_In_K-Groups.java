// Brute force


class Solution {
    public int countNodes(ListNode head){
        int count = 0;
        ListNode temp = head;

        while(temp!=null){
            count++;
            temp = temp.next;
        }

        return count;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        int length = countNodes(head);

        int validReverses = length - length%k;

        Queue<Stack<Integer>> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        ListNode temp = head;

        while(validReverses-->0){
            if(st.size()!=k){
                st.add(temp.val);
                temp = temp.next;
                continue;
            }
            else{
                q.add(st);
                st = new Stack<>();
                st.add(temp.val);
                temp = temp.next;
            }
        }

        q.add(st);

        ListNode dummy = new ListNode(0);
        temp = dummy;

        while(!q.isEmpty()){
            Stack<Integer> stack = q.poll();

            while(!stack.isEmpty()){
                int val = stack.pop();

                temp.next = new ListNode(val);
                temp = temp.next;
            }
        }

        validReverses = length - length%k;
        ListNode temp2 = head;

        while(validReverses-->0){
            temp2 = temp2.next;
        }

        while(temp2 != null){
            temp.next = new ListNode(temp2.val);
            temp = temp.next;
            temp2 = temp2.next;
        }

        return dummy.next;
    }
}