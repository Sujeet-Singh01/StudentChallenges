class Genclass<K,V>
{
    K A[]=(K[])new Object[10];
    V B[]=(V[]) new Object[20];
    int length=0;

    public void append(K vl,V val)
    {
        A[length]=vl;
        B[length++]=val;

    }
    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println(A[i]+" "+B[i]);
        }
    }
}
public class NewGen01 {
    public static void main(String args[])
    {
        Genclass<String,Integer> gc=new Genclass<>();
        gc.append("New",10);
        gc.append("Generic",20);
        gc.append("class",30);
        gc.display();

    }
}
