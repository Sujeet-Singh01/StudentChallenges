class A{}
class B extends A{}
class C extends A{}
interface D{}
class E implements D{}

class NewGen03Class<T extends Number>
{
    T A[]=(T[]) new Object[50];
    int len=0;

    public void add(T val)
    {
        A[len++]=val;
    }
    public void display()
    {
        for(int i=0;i<len;i++)
        {
            System.out.println(A[i]);
        }
    }
}
class NewG<K extends A>
{

}
class NewG01<V extends String>
{

}

class NewG02<L extends D>
{

}
public class NewGen03 {

    public static void main(String args[])
    {
        NewGen03Class<Float> ng=new NewGen03Class<>();
        NewGen03Class<Integer> ng1=new NewGen03Class<>();
        NewGen03Class<Double> ng2=new NewGen03Class<>();
        ng.add(10.5f);
        ng.display();
        NewG<A> n=new NewG<>();
        NewG<B> n1=new NewG<>();
        NewG<C> n2=new NewG<>();

        NewG01<String> n01=new NewG01<>();

        NewG02<D> n02=new NewG02<>();
        NewG02<E> n002=new NewG02<>();


    }
}
