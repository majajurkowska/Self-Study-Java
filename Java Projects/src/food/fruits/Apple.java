package food.fruits;

class Gala
{
    public void abc()
    {
        Apple apple = new Apple();
        System.out.println(apple.country);
    }
}

public class Apple
{
    protected String country = "Germany";

    public int seeds = 9;

    public void show()
    {
        System.out.println("In Apple show");
    }
}
