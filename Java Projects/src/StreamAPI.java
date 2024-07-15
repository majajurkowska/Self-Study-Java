import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        /*
        Stream<Integer> s1 = nums.stream();
        //changes that we make to this stream will not affect nums
        //once we worked with a stream we can't reuse it

        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int result = s3.reduce(0, (c,e) -> c+e);

        System.out.println(result);

        Can be written as:
         */
        int result = nums.stream()
                        .filter(n -> n%2==0)
                        .map(n -> n*2)
                        .reduce(0, (c,e) -> c+e);
        System.out.println(result);

        //s3.forEach(n -> System.out.println(n));
        //s2.forEach(n -> System.out.println(n));
        //s1.forEach(n -> System.out.println(n));
        //nums.forEach(n -> System.out.println(n));
    }
}
