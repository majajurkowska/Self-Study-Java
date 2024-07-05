class E // outer classes cannot be static
{
    int age;

    public void show()
    {
        System.out.println("in show");
    }

    class F // Inner classes can be static, but this one is non-static
    {
        public void config()
        {
            System.out.println("in config");
        }

    }
}

public class InnerClass
{
    public static void main(String[] args)
    {
        //for non-static inner classes - need an instance of the outer class

        E obj = new E(); // Creating an instance of the outer class E
        obj.show(); // Calling the method of the outer class

        E.F obj1 = obj.new F();
        obj1.config();

        //for static inner classes - Can be instantiated without an instance of the outer class.
        //E.F obj1 = new E.F();
        //obj1.config();
    }
}
