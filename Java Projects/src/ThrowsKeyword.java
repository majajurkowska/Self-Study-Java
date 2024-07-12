// Class that declares it can throw a ClassNotFoundException
class Irresponsible
{
    public void show() throws ClassNotFoundException
    {
        // Attempting to load a class named "Shark" which does/may not exist
        Class.forName("Shark");
    }

}

public class ThrowsKeyword
{
    static
    {
        System.out.println("class loaded");
    }

    public static void main(String[] args)
    {
        Irresponsible obj = new Irresponsible();
        try
        {
            // Calling the show method which may throw ClassNotFoundException
            obj.show();
        }
        catch (ClassNotFoundException e)
        {
            // Handling the exception if the class "Shark" is not found
            System.out.println("class not found");
        }

    }
}
