class MyArr<T>
{
    T[] A=(T[]) new Object[10];
    public MyArr(T[] array)
    {
        A=array;
    }

    public void display()
    {
        for(T a:A)
        {
            System.out.println(a);
        }
    }
    public void append(T add)
    {

    }
}
public class GenWildCard {

    static void fun(MyArr<?> str)
    {
        str.display();
    }

    static void fun1(MyArr<? extends Number> str1)     // We can use super keyword also in place of extends
    {                                                  // It is allowed in methods only

        // if i write (MyArr<? super Number) then it will allow only super classes of Number class
        // It will not allow sub classes like Integer, Double etc.
        // And all these are allowed using WildCard Only(?)

        /* WildCard can accept all values but we cannot access

            static void fun(MyArr<?> str)
    {
        str.append("Hello");  it is not allowed, we can paas only null
            }

        */
        str1.display();
    }
    public static void main(String args[])
    {
        MyArr<Integer> arInteger=new MyArr<>(new Integer[]{122,34,12,56});
        fun(arInteger);

        MyArr<String> strString=new MyArr<>(new String[] {"hello","java"});
        fun1(arInteger);            //Here I cannot pass parameter other than classes Inheriting from
                                    // Number class


    }
}
