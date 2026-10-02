public class LinearSearch {
    
    static void searchingKeyValue(int[] array, int key)
    {
        boolean found = false;//key not found

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == key)
            {
                System.out.println("Element Found at index " + i);
                found = true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("Element Not Found");
        }
    }
    public static void main(String [] args)
    {
        int [] array = {10, 20, 30, 70, 50, 60};
        int key = 40;
        searchingKeyValue(array, key);
    }
}
