@SuppressWarnings("unchecked")
class Gen2<T>
{
    T A[]=(T[])new Object[10];
    int lenght=0;
    public void append(T val)
    {
        A[lenght++]=val;
    }
    public void display()
    {
        for(int i=0;i<lenght;i++)
        {
            System.out.println(A[i]);
        }
    }

}
public class Generic02 {
    public static void main(String args[])
    {
        Gen2<String> g2=new Gen2<>();
        g2.append("Hello");
        g2.append("Java");
        g2.append("Program");

        g2.display();
    }
}
