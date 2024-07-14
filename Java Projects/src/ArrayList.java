import java.util.List;

public class ArrayList
{
    public static void main(String[] args)
    {
        // Create a list to store integers using ArrayList
        List<Integer> nums = new java.util.ArrayList<Integer>();

        // Add elements to the list
        nums.add(1);
        nums.add(7);
        nums.add(9);
        nums.add(5);
        nums.add(2);

        // Print the entire list
        System.out.println(nums); // Output: [1, 7, 9, 5, 2]

        // Get and print the element at index 3
        System.out.println(nums.get(3)); // Output: 5

        // Find and print the index of element '2'
        System.out.println(nums.indexOf(2)); // Output: 4

        for(Integer n : nums)
        {
            System. out.println ("element: " + n);
        }

    }
}
