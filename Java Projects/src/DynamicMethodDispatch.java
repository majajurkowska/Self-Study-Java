class Example1
{
    public void show()
    {
        System.out.println("In Example1 show");
    }
}

class Example2 extends Example1
{
    public void show()
    {
        System.out.println("In Example2 show");
    }
}

class Example3 extends Example1
{
    public void show()
    {
        System.out.println("In Example3 show");
    }
}

public class DynamicMethodDispatch
{
    public static void main(String[] args)
    {
        //run time polymorphism

        Example1 obj = new Example1();
        //this lets you reuse the variable for all objects of the child classes
        obj.show();

        obj = new Example2();
        obj.show();

        obj = new Example3();
        obj.show();
    }
}
