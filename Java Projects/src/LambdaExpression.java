@FunctionalInterface // An interface with just one abstract method
interface L
{
    void show(int i);
}

public class LambdaExpression
{
    public static void main(String[] args)
    {
        /*
        Normally, we write:

        L obj = new L() {
            @Override
            public void show(int i) {
                System.out.println("in show " + i);
            }
        };

        But with lambda expressions, we can write:

        L obj = i -> {
            System.out.println("in show " + i);
        };
        obj.show(5);

        So we are skipping the 'new L()' as well as the name of the method.
        We also don't need to specify the argument type in the override method.
        Also, if we just have one parameter, we can skip the round brackets surrounding it.

        If we have a single statement in the method body, we can further simplify it:
         */
        L obj = i -> System.out.println("in show " + i);

        obj.show(5);
    }
}
