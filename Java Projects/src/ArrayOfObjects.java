class Student
{
    int rollno;
    String name;
    int marks;
}

public class ArrayOfObjects
{
    public static void main(String a[])
    {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Timmy";
        s1.marks = 80;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Johnny";
        s2.marks = 87;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Hunter";
        s3.marks = 83;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i< students.length; i++)
        {
            System.out.println(students[i].name + " : " + students[i].marks);
        }

    }
}
