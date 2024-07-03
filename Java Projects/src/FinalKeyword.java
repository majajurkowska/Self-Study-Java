//final class Cal
class Cal
{
    public final void show()
    {
        System.out.println("By Me");
    }
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}

//FINAL FOR CLASSES - no one can extend it, stops the inheritance
//class AdvCal extends Cal - error because the class is final therefore cannot be extended by child classes
//{

//}

class AdvCal extends Cal
{
    //FINAL FOR METHODS
    //public void show() - error because we can't override a final method
    //{
    //    System.out.println("By John");
    //}
}

public class FinalKeyword
{
    public static void main(String[] args)
    {
        //FINAL FOR VARS
        //final int num = 8;
        //num = 9; - error because num is final, final - constant, unchangeable
        //System.out.println(num);

        AdvCal obj = new AdvCal();
        obj.show();
        obj.add(2,6);
    }
}

//final - variable (makes a constant, stops reassignment), method(stops method overriding), class(stops inheritance)