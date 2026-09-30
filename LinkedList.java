package WeekFive;

public class LinkedList
{

    public static void main(String[] args) 
    {
        Node head = null;
        System.out.print(head + "-->");

        System.out.println();
        head = insertAtStart(105, head);
        head = insertAtStart(104, head);
        head = insertAtStart(103, head);
        head = insertAtStart(102, head);
        head = insertAtStart(101, head);
        head = insertAtStart(100, head);
        printListOfNode(head);

        System.out.println();
        insertAtEnd(500, head);
        printListOfNode(head);

        System.out.println();
        insertAfterKey(300, 103, head);
        printListOfNode(head);
    }

    public static void printListOfNode(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + "-->");
            node = node.next;
        }
        System.out.print("null");
    }

    public static Node insertAtStart(int data, Node head)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        newNode.next = head;
        head = newNode;

        return newNode;
    }

    public static Node insertAtEnd(int data, Node head)
    {
        Node lastNode = new Node();
        lastNode.data = data;
        lastNode.next = null;

        Node Temp_var = head;
        while(Temp_var.next != null)
        {
            Temp_var = Temp_var.next;
        }
        Temp_var.next = lastNode;

        return head;
    }

    public static void insertAfterKey(int data, int key, Node head)
    {
        Node middleNode = new Node();
        middleNode.data = data;
        middleNode.next = null;

        if(head == null)
        {
            return;
        }

        if(head.next == null)
        {
            head.next = middleNode;
            return;
        }

        Node keyNode = head;

        while(keyNode != null && keyNode.data != key)
            {
                keyNode = keyNode.next;
            }

        if(keyNode == null)
        {
            return;
        }
        middleNode.next = keyNode.next;
        keyNode.next = middleNode;
    }
}
