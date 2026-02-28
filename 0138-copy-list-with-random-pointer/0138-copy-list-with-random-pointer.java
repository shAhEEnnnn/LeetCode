class Solution {

    public Node deepCopy(Node head1){
        Node temp1 = head1;
        Node dummy = new Node(-1);
        Node temp2 = dummy;

        while(temp1 != null){   // FIXED
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = t;
            temp1 = temp1.next;
        }
        return dummy.next;
    }

    public void merge(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;

        while(temp1 != null && temp2 != null){   // FIXED
            Node next1 = temp1.next;
            Node next2 = temp2.next;

            temp1.next = temp2;
            temp2.next = next1;

            temp1 = next1;
            temp2 = next2;
        }
    }

    public void randomConection(Node head1,Node head2){
        Node temp1 = head1;
        Node temp2 = head2;

        while(temp1 != null){
            if(temp1.random == null) 
                temp2.random = null;
            else
                temp2.random = temp1.random.next;

            temp1 = temp1.next.next;
            if(temp2.next != null) 
                temp2 = temp2.next.next;
        }
    }

    public Node split(Node head1){   // FIXED return type
        Node temp = head1;
        Node head2 = head1.next;
        Node copy = head2;

        while(temp != null){
            temp.next = temp.next.next;

            if(copy.next != null)
                copy.next = copy.next.next;

            temp = temp.next;
            copy = copy.next;
        }
        return head2;
    }

    public Node copyRandomList(Node head1) {

        if(head1 == null) return null;

        Node head2 = deepCopy(head1);
        merge(head1, head2);
        randomConection(head1, head2);
        return split(head1);
    }
}