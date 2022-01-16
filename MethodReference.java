interface LamdaExp
{
    public void display(String s);
}
public class MethodReference {
    public static void main(String args[])
    {
        LamdaExp le=System.out::println;
        le.display("Hii");

    }
}
