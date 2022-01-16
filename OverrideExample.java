class car
{
    public void start(){System.out.println("Car stated");}
    public void changeGear(){System.out.println("Gear is changed");}
    public void accelerate(){System.out.println("car is accelerated");}
}
class LuxuryCar extends car
{
    @Override
    public void changeGear(){System.out.println("Gear changed automatically");}
    public void OpenSunRoof(){System.out.println("Sun roof is opened");}
}
public class OverrideExample {
    public static void  main(String args[])
    {
        car c=new LuxuryCar();
        c.start();
        c.accelerate();
        c.changeGear();

    }
}
