abstract class Q
{
    public abstract void show();
}

public class AbstractAnonymousInnerClass
{
    public static void main(String[] args)
    {
        Q obj = new Q() //this is not instance of Q, but of an anonymous inner class
        { //here our anonymous class is providing an implementation of the show method for our abstract class
            public void show()
            {
                System.out.println("in anonymous show");
            }
        };
        obj.show();

    }
}
