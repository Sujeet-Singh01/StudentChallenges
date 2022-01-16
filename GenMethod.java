public class GenMethod {
    static <T> void print(T[] list)
    {
        for(T a:list)
        {
            System.out.println(a);
        }
    }

    static<A> void printVarArgs(A... list)
    {
        for(A a:list)
        {
            System.out.println(a);
        }
    }

    public static void main(String args[])
    {
        print(new String[] {"hi","Bye"});
        print(new Integer[] {23,45,22});

        printVarArgs(new String[]{"Hii","Welcome"});
        printVarArgs(12,34,54,"new");

    }
}
