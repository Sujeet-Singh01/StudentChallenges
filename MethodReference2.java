interface inter
{
    public void display(String str);
}


public class MethodReference2 {
    public static void reverse(String st)
    {
        StringBuffer sb=new StringBuffer(st);
        sb.reverse();
        System.out.println(sb);
    }
    public static void main(String args[])
    {
        inter l=MethodReference2::reverse;
        l.display("Sujeet");
    }
}
