public class StringBuffer
{
    public static void main(String a[])
    {
        java.lang.StringBuffer sb = new java.lang.StringBuffer("Timmy");

        System.out.println(sb.capacity());
        //default capacity (without initial string) is 16 characters to reduce the need for resizing
        //when created with an initial string the capacity is 16 + the length of the string
        //so because Timmy is 5 chars the capacity is 21.

        System.out.println(sb.length());

        sb.append(" Smith");
        System.out.println(sb);

        String str = sb.toString();

        sb.deleteCharAt(3);
        System.out.println(sb);

        sb.insert(5, "Java ");
        System.out.println(sb);
    }
}

//The difference between a string buffer and builder is that the string buffer is thread safe and i will learn
//what that means in the upcoming parts of the course
