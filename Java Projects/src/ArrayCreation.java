public class ArrayCreation {
    public static void main(String a[]) {
        int nums[] = new int[4]; //all values are initially set to 0
        //can also write int nums[] = {4,8,3,9};
        nums[0] =4;
        nums[1] =8;
        nums[2] =3;
        nums[3] =9;

        for(int i=0;i<=3;i++) {
            System.out.println(nums[i]);
        }

        //System.out.println(nums[1]); for printing a specific value
    }
}
