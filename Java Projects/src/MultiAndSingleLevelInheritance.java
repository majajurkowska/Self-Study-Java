class BaseCalculator
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public int sub(int n1, int n2)
    {
        return n1 - n2;
    }
}

class DerivedCalculator extends BaseCalculator
{
    public int multi(int n1, int n2)
    {
        return n1 * n2;
    }
    public int div(int n1, int n2)
    {
        return n1 / n2;
    }
}

//just two classes - single level inheritance
// A (parent of B) -> B (child of A)

class AdvancedCalculator extends DerivedCalculator
{
    double power(int n1, int n2)
    {
        return Math.pow(n1, n2);
    }
}

//more classes - multi level inheritance
// A (parent of B) -> B (child of A and parent of C) -> C (child of B)

public class MultiAndSingleLevelInheritance
{
    public static void main(String[] args)
    {
        BaseCalculator obj = new BaseCalculator();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(8, 5);

        System.out.println(r1 + " and " + r2);

        DerivedCalculator obj1 = new DerivedCalculator();
        int r3 = obj1.add(2, 6);
        int r4 = obj1.div(10, 5);

        System.out.println(r3 + " and " + r4);

        AdvancedCalculator obj2 = new AdvancedCalculator();
        int r5 = obj2.add(8, 6);
        int r6 = obj2.div(15, 5);
        double r7 = obj2.power(4, 2);

        System.out.println(r5 + " and " + r6 + " and " + r7);

    }
}
// Inheritance relationships:
//Parent - child
//Super - sub
//Base - derived