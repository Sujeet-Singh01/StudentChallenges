import java.util.Scanner;
public class Exception1 {
    public static void main(String args[])
    {
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b=sc.nextInt();
        try
        {
            c=a/b;
            System.out.println("The result is: "+c);

        }
        catch(Exception e)
        {
            System.out.println("Denominator must be non-zero ");
        }
        System.out.println("Bye");
    }
}
