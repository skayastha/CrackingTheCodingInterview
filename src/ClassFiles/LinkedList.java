package ClassFiles;

public class LinkedList {

    public static class Node
    {
        Node next = null;
        int data = 0;

        public Node(int d){
            this.data = d;
        }

        private void AppendToTail(int d)
        {
            Node end = new Node(d);
            Node n = this;
            while (n.next!=null)
            {
                n = n.next;
            }
            n.next = end;
        }

        private void PrintLinkedList(Node head)
        {
            Node n = this;
            while(n.next!=null)
            {
                System.out.println(n.data);
                n=n.next;
            }
            System.out.println(n.data);
        }

        public Node deleteNode(Node head, int d)
        {
            //Base cases
            if (head == null)
                return null;

            Node n = head;

            if(n.data == d)
            {
                return head.next;
            }

            while(n.next!= null)
            {
                if (n.next.data == d)
                {
                    n.next = n.next.next;
                    return head;
                }
                n=n.next;
            }
            return head;
        }
    }

    public static void main (String[] args)
    {
        Node n = new Node(1);
        Node head = n;
        n.AppendToTail(2);
        n.AppendToTail(3);
        //n.PrintLinkedList(head);
        head = n.deleteNode(head,2);
    }
}
