
public class Exception5 {
    static int meth()
    {
        return 10/0;
    }
    static void meth2()
    {
        System.out.println(meth());
    }
    static void meth3()
    {
        meth2();
    }
    public static void main(String args[])
    {   try {
        meth3();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
}
