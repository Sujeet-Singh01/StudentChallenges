interface NewI
{
    public int display(String str1,String str2);
}
public class CompareUsingMethodReference {
    public static void main(String args[])
    {
        NewI n=String::compareTo;
        System.out.println(n.display("hello","welcome"));
    }
}
