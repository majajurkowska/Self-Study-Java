import java.util.HashSet;
import java.util.Set;

public class SetInJava
{
    public static void main(String[] args)
    {
        Set<Integer> nums = new HashSet<Integer>();

        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);

        for(int n : nums)
        {
            System. out.println ("element: " + n);
        }

    }
}