public class Exception2 {
    public static void main(String args[])
    {
        int A[]={10,20,30,40,0};
        try
        {
            int a=A[1]/A[0];
            System.out.println("Division is: "+a);
            System.out.println(A[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator must be non-zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Enter the valid index");
        }
        System.out.println("Bye");

    }
}
