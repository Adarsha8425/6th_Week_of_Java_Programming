public class MyArray {
    
    int [] array;//place to store elements
    int length;//size of an array
    int index; //pointing at empty box. that has elements.

    //this is constructor
    public MyArray()
    {
        length = 5;
        index = 0;
        array = new int[length];
    }

    //insert At end
    public void insertAtEnd(int value)
    {

        if(index == length)
        {
            System.out.println("Array is full");
            return;
        }
        array[index] = value;
        index++; // after inserting at the end size go increment
    }

    public void insertAtStart(int values)
    {
        if(index == length)
        {
            System.out.println("Array is full");
            return;
        }
        else
        {
            //shift element to one position
            for(int i = index - 1; i >= 0; i--)
            {
                array[i+1] = array[i];
            }
        }
        array[0] = values;
        index++;
    }

    public void insertAtAnyPosition(int value, int position)
    {

        if(index == length)
        {
            System.out.println("Array is full");
            return;
        }

        if(position > index || position < 0)
        {
            System.out.println("Invalid position");
        }
        else
        {
            for(int i = index-1; i >= position; i--)
            {
                array[i+1] = array[i];
            }
        }
        array[position] = value;
        index++;
    }

    //print elements
    public void printElement()
    {
        System.out.println("index\tvalue");
        for(int i = 0; i < length; i++)
        {
           System.out.println(i + "\t" + array[i]);
        }

        System.out.println("Size " + index);
    }
}
