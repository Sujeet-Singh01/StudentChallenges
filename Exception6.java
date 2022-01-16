class StackOverFlowException extends Exception
{
    public String toString()
{
    return "String is full";
}
public class StackUnderFlowException extends Exception
{
    public String toString()
    {
        return "String is Empty";
    }
}
}
class Stack
{
    private int size;
    private int top=-1;
    private int S[];
    public Stack(int sz)
    {
        size=sz;
        S=new int[sz];
    }
    public void push(int x) throws StackOverFlowException
    {
        if(top==size-1)
        throw new StackOverFlowException();
        top++;
        S[top]=x;

    }
    public int pop()
    {
        int x=-1;


        x=S[top];
        top--;
        return x;


    }

}

public class Exception6 {
    public static void main(String args[])
    {
        try {
            Stack s = new Stack(5);
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(50);

        }
        catch(StackOverFlowException e)
        {
            System.out.println(e);
        }


    }
}
