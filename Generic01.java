/*There are mainly 3 advantages of generics.
1) Type-safety: We can hold only a single type of objects in generics.
 It doesn't allow to store other objects.
 2) Type casting is not required: There is no need to typecast the object.
 3) Compile-Time Checking: It is checked at compile time so problem will
  not occur at runtime.
  The good programming strategy says it is far better to handle the problem
  at compile time than runtime.

 */




class Gen<T>
{
    private T obj;
    public void setData(T val)
    {
        obj=val;

    }
    public T getData()
    {
        return obj;
    }
}
public class Generic01 {
    public static void main(String args[])
    {
        Gen<String> g=new Gen<>();
        g.setData("Hii");
        String str=g.getData();
        System.out.println(str);
    }
}
