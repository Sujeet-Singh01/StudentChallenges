class MyArray<T>
{
    T A[]=(T[])new Object[10];
    int len=0;
    public void addElement(T value)
    {
        A[len++]=value;
    }
    public void display()
    {
        for(int i=0;i<len;i++)
        {
            System.out.println(A[i]);
        }
    }
}

class MyArray2<R> extends MyArray<R>
{

}
public class NewGen02 {
    public static void main(String args[])
    {
        MyArray2 ma=new MyArray2();
        ma.addElement("passing");
        ma.addElement("Generics");
        ma.addElement(20);
        ma.display();
    }
}
