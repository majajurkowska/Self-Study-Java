class Calc
{
    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public double add(double n1, int n2)
    {
        return n1 + n2;
    }
}

//we have multiple methods with the same name but different number or type of parameters - method overloading

public class MethodOverloading
{
    public static void main(String a[])
    {
        Calc obj = new Calc();
        int r1 = obj.add(3, 4);
        System.out.println(r1);
    }
}
