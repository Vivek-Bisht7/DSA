class Solution {
    public Node copyRandomList(Node head) {
        Node dummy = new Node(0);

        Node temp = head;
        Node temp2 = dummy;

        // Make normal linkedlist clone where for now all randoms are pointing to null

        while(temp!=null){
            Node newNode = new Node(temp.val);
            temp2.next = newNode;
            temp2 = temp2.next;
            temp = temp.next;
        }

        // Here we will use a hashmap , first iterate over both the original ll and copied ll and put them correspondingly in the hashmap such then when we need to map random then we will get the originalNode and we have to set the copied node there .... in 0(1) time...

        temp = head;
        temp2 = dummy.next;

        HashMap<Node,Node> map = new HashMap<>();

        while(temp2!=null){
            map.put(temp,temp2);
            temp = temp.next;
            temp2 = temp2.next;
        }

        // set random copied node

        temp = head;
        temp2 = dummy.next;

        while(temp!=null){
            temp2.random = map.get(temp.random);
            temp = temp.next;
            temp2 = temp2.next;
        }

        return dummy.next;
    }
}