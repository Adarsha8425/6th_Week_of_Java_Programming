public class DemoArray {
    
    public static void main(String[] args)
    {
        MyArray myArray = new MyArray();

        System.out.println("Initial Array");
        myArray.printElement();

        myArray.insertAtStart(10);
        System.out.println("After inserting 10 at the start");
        myArray.printElement();

        myArray.insertAtEnd(20);
        System.out.println("After inserting 20 at the end");
        myArray.printElement();

        System.out.println("After insert At any position");
        myArray.insertAtAnyPosition(15, 4);
        myArray.printElement();

    }
}
