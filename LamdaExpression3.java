@FunctionalInterface
interface lamdaDemo2
{
    public int add(int x,int y);
}
public class LamdaExpression3 {
    public static void main(String args[])
    {
        lamdaDemo2 ld=(a,b)->{return a+b;};
        int x=ld.add(20,50);
        System.out.println(x);
    }
}
