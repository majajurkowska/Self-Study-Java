import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEachMethod
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        Consumer<Integer> con = new Consumer<Integer>()
        {
            @Override
            public void accept(Integer integer)
            {
                System.out.println(integer);
            }
        };
        //can also use a lambda expression since this is a functional interface
        //would look like this:
        //Consumer<Integer> con = n -> System.out.println(n);

        //can also:
        //nums.forEach(n -> System.out.println(n));

        nums.forEach(con);

        //nums.forEach(n -> System.out.println(n));
    }
}
