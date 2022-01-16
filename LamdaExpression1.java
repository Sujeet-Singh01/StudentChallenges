@FunctionalInterface
interface lamdaDemo
{
    public void display();
}
public class LamdaExpression1 {
    public static void main(String args[])
    {
        lamdaDemo ld=()->{System.out.println("Hello");};

    }
}
