class Tv
{
    public void switchOn(){System.out.println("Tv is Switched on");}
    public void changeChannel(){System.out.println("Tv channel is changed");}

}
class SmartTv extends Tv
{
    @Override
    public void switchOn(){System.out.println("SmartTv is Switched on");}
    @Override
    public void changeChannel(){System.out.println("SmartTv channel is changed");}
    public void browse(){System.out.println("You can Browse here");}
}
public class DynamicMethodDispatch {
    public static void main(String args[])
    {
        Tv t=new SmartTv();
        t.switchOn();
        t.changeChannel();
    }
}
