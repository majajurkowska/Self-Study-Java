import java.util.*;
import java.util.ArrayList;

//if we wanted to work with just sort and no comparator we would have to here implement class comparable
//and also have to define its method
class StudentInfo
{
    int age;
    String name;

    public StudentInfo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ComparatorVsComparable
{
    public static void main(String[] args)
    {
        /*
        Comparator<Integer> com = new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }

        };

        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums, com);
        //passing the comparator to have our own logic we sort by
        System.out.println(nums);
         */

        Comparator<StudentInfo> com = new Comparator<StudentInfo>()
        {
            public int compare(StudentInfo i, StudentInfo j)
            {
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }

        };

        List<StudentInfo> studs = new ArrayList<>();
        studs.add(new StudentInfo(16, "Emilia"));
        studs.add(new StudentInfo(15, "Kasia"));
        studs.add(new StudentInfo(17, "Zofia"));
        studs.add(new StudentInfo(13, "Ania"));

        Collections.sort(studs, com);
        for(StudentInfo s : studs)
            System.out.println(s);


    }
}
