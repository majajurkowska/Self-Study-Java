class Comp
{
    public void playMusic()
    {
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 10)
            return "Pen";
        //else - not necessary cuz as soon as it sees return pen it will jump out of the method
        return "Pay at least a 10";
    }
}

public class Methods
{
    public static void main(String a[])
    {
        Comp obj = new Comp();
        obj.playMusic();
        String str = obj.getMeAPen(3);
        System.out.println(str);
    }
}