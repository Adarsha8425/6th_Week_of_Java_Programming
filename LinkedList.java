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

    
}
