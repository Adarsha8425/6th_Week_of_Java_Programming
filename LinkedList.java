package WeekFive;

public class LinkedList
{

    public static void main(String[] args) 
    {
        NewNode newNode = new NewNode();
        newNode.data = 101;
        newNode.next = null;

        System.out.println(newNode.data);
        System.out.println(newNode.next);
        
        NewNode secondNode = new NewNode();
        secondNode.data = 102;
        secondNode.next = null;

        newNode.next = secondNode;

        System.out.println(newNode.next.data);
        System.out.println(newNode.next.next);
        //System.out.println(newNode.next.next.next);

        

    }
}
