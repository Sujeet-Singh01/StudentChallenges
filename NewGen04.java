class GenPractice<T extends Number>
{
    T A[];

    public GenPractice(T[] a) {
        A = a;
    }
    int len=0;
    public void add(T vl)
    {
        A[len++]=vl;
    }
    public void display()
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
    }
}
public class NewGen04 {
    public static void main(String args[])
    {


            GenPractice<Integer> gp=new GenPractice<>(new Integer[] {1, 2, 3});


            gp.display();
    }
}
