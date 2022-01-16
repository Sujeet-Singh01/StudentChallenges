public class GenericDemo<T>
{
    T data[]=(T[]) new Object[3];


    public static void main(String args[])
    {
        GenericDemo<String> gd=new GenericDemo();

        gd.data[0]="Hello";
        gd.data[1]="World";
        String str=gd.data[0];


    }
}
