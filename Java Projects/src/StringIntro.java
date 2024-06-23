public class StringIntro
{
    public static void main(String a[])
    {
        String name = new String("Navin");
        String response = "Good"; //This object is getting created "behind the scenes".

        System.out.println("Hello " + name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(1));
        System.out.println(name.concat(", how are you?"));
        System.out.println(response);
    }
}
