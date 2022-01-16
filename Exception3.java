class LowBalanceException extends Exception
{
    public String toString()
    {
        return "Low balance must be greater than 1000 rupees";
    }
}

public class Exception3 {
    public static void main(String args[])
    {
        fun1();
    }
    static void fun1()
    {
        try
        {
            throw new LowBalanceException();
        }
        catch(LowBalanceException e)
        {
            System.out.println(e);
        }
    }
}

