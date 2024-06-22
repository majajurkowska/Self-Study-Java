class Student2
{
    int rollno;
    String name;
    int marks;
}

public class EnhancedForLoop
{
    public static void main(String a[])
    {
        /*
        int nums[] = new int[4];
        nums[0] = 3;
        nums[1] = 7;
        nums[2] = 2;
        nums[3] = 5;

        for(int n : nums)
        {
            System.out.println(n);
        }
         */

        Student2 s1 = new Student2();
        s1.rollno = 1;
        s1.name = "Timmy";
        s1.marks = 80;

        Student2 s2 = new Student2();
        s2.rollno = 2;
        s2.name = "Johnny";
        s2.marks = 87;

        Student2 s3 = new Student2();
        s3.rollno = 3;
        s3.name = "Hunter";
        s3.marks = 83;

        Student2 students[] = new Student2[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //for(int i=0; i< students.length; i++)
        //{
        //    System.out.println(students[i].name + " : " + students[i].marks);
        //}

        for(Student2 stud : students)
        {
            System.out.println(stud.name + " : " + stud.rollno);
        }
    }
}
