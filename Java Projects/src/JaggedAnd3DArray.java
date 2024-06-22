public class JaggedAnd3DArray
{
    public static void main(String a[])
    {
        /*
        int nums[][] = new int[3][]; //jagged
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums[i].length; j++)
            {
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        //enhanced loop is good here because no need to specify the sizes
        for(int n[] : nums)
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
         */

        int nums[][][] = new int[3][4][5]; //three dimensional array

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                for(int k=0; k<5; k++)
                {
                    nums[i][j][k] = (int)(Math.random() * 10);
                }
            }
        }

        for(int n[][] : nums)
        {
            for(int m[] : n)
            {
                for(int l : m)
                {
                    System.out.print(l + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
