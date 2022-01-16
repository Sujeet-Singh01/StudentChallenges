class NegativeValueException extends Exception
{
    public String toString()
    {
        return "Values given must be positive";
    }
}
public class Exception4 {
    public int main(String args[])
    {
        meth1();
        return 0;
    }

    int  meth1() {
        try {
           int a= meths2(20, 10);
            System.out.println(a);
        }
        catch(NegativeValueException e)
        {
            System.out.println(e);
        }
        return 0;
    }
    int meths2(int a,int b) throws NegativeValueException
    {
        if (a<0||b<0)
        throw new NegativeValueException();
        int c=a*b;
        return c;

    }
}
