public class GenericsDemonstration<T>
{
    T newData[]=(T[])new Object[3];
    public static void main(String args[])
    {
        GenericsDemonstration<Integer> gsd=new GenericsDemonstration();

        gsd.newData[0]=10;
        gsd.newData[1]=20;
        gsd.newData[2]=30;

        int a=gsd.newData[1];
        System.out.println(a);

    }
}
