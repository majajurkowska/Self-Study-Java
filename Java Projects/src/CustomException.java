// Custom exception class extending the Exception class
class MyOwnException extends Exception
{
    // Constructor that accepts a string message
    public MyOwnException(String string)
    {
        super(string); // Call the superclass (Exception) constructor with the string
    }
}

public class CustomException
{
    public static void main(String[] args)
    {
        int i = 20;
        int j = 0;

        try
        {
            j = 18/i;
            if(j==0)
                throw new MyOwnException("I don't want to print a zero");
        }
        catch(MyOwnException e)
        {
            j=18/1;
            System.out.println("this is the default output " + e);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong.." + e);
        }

        System.out.println(j);
        System.out.println("Bye");

    }
}

