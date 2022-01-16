interface NewInterface
{
    public void displays(String str);
}
public class MethodReference3 {
    public MethodReference3(String s)
    {
        System.out.println("String is: "+s);
    }
    public void display(String args[])
    {
        NewInterface n=MethodReference3::new;
        n.displays("New Method Reference program");
    }
}
