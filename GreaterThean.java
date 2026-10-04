public class GreaterThean {
    
    static char smallest(char []ch, char target)
    {
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] > target)
            {
                return ch[i];
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {

        char []ch = {'c', 'f', 'j'};
        char target = 'p';

        char result = smallest(ch, target);
        System.out.println(result);
    }
}
