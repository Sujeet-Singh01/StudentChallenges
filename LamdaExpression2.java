@FunctionalInterface
interface lamdaDemo1
{
    public void display(String s);

}
public class LamdaExpression2 {
    public static void main(String args[])
    {
        lamdaDemo1 ld=(s)->{
            System.out.println(s);
        };

        ld.display("Demo Lamda Expression");
    }
}
