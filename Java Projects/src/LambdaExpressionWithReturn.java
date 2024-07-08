@FunctionalInterface // Remember that lambda expressions only work with functional interfaces
interface R
{
    int add(int i, int j);
}

public class LambdaExpressionWithReturn
{
    public static void main(String[] args)
    {
        /*
        R obj = new R()
        {
            @Override
            public int add(int i, int j)
            {
                return i+j;
            }
        };

        int result = obj.add(3, 5);
        System.out.println(result);

        For multiple statements in the lambda body, we use curly braces and the return statement:
        R obj = (i, j) ->
        {
            int sum = i + j;
            return sum;
        };
         */

        R obj = (i,j) -> i+j;

        int result = obj.add(3, 5);
        System.out.println(result);
    }
}
