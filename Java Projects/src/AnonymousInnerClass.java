class G
{
    public void show()
    {
        System.out.println("in G show");
    }
}

public class AnonymousInnerClass
{
    public static void main(String[] args)
    {
        G obj = new G()
        { //this is anonymous inner class, it doesn't have a name, its only purpose here is to override the show method
            public void show()
            {
                System.out.println("in new show");
            }
        };
        obj.show();

    }
}
