@FunctionalInterface
interface lamdaDemo3
{
    public int add(int x,int y);
}
public class LamdaExpression4 {


        public static void main(String args[])
        {
            lamdaDemo2 ld=(a, b)->a+b;
            int x=ld.add(20,50);
            System.out.println(x);
        }

}
