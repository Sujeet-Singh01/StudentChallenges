class NewGen<T>                 //Here T will acts as an object
{
    T A[]=(T[])new Object[10];
    int length=0;
    public void append(T value)
    {
        A[length++]=value;
    }

    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println(A[i]);
        }

    }
}
public class GenFurther {
    public static void main(String args[])
    {
        NewGen str=new NewGen();        //When generic parameter is not given it will take is an objects

        str.append(10);             //Here the objects are passed
        str.append("Welcome");
        str.append("Bye");
        str.display();
    }
}
