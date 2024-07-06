enum Lap
{
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    // Default constructor for Surface which doesn't specify a price
    Lap()
    {
        price = 1000;
    }

    // Constructor with a price parameter
    Lap(int price)
    {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumClass
{
    public static void main(String[] args)
    {
        // Accessing a specific enum constant and its price
        //Lap laptop = Lap.Macbook;
        //System.out.println(laptop + " : " + laptop.getPrice());

        // Looping through all enum constants and printing their prices
        for(Lap laptop : Lap.values())
        {
            System.out.println(laptop + " : " + laptop.getPrice());
        }
    }
}
