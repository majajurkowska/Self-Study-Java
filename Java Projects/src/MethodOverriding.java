class H
{
    public void show()
    {
        System.out.println("in H show");
    }

    public void config()
    {
        System.out.println("in H config");
    }
}

class M extends H
{
    @Override // This is an annotation that tells the compiler we are overriding the method
    // Annotations can help with debugging and provide better readability.
    public void show()
    {
        System.out.println("in M show");
    }
    // The show method in class M overrides the show method in class H.
    //The method in the subclass must have the same name, return type, and parameters as the method in the superclass.
}

public class MethodOverriding
{
    public static void main(String[] args)
    {
        M obj = new M();

        obj.show();
        // Calls the show method in class M because it overrides the show method in class H.

        obj.config();
        // Calls the config method in class H because it is not overridden in class M.
    }
}
