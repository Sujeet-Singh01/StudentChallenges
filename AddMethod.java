public class AddMethod {
  static int add(int a,int b)
    {
        int c=a+b;
        return c;

    }
    public static void main(String args[])
    {
        int a=5,b=10,c=0;
        c=add(a,b);
        System.out.println("The total is: "+c);

    }
}
