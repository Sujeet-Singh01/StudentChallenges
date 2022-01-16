import java.util.Scanner;
public class Fib {
    public static void main(String[] args)
    {
        System.out.println("To Show Fibonacci Series:");
        System.out.println("Enter the number of terms you want to see:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.print("Fibonacci Series is: 0,1,");
        for (int i=0; i<n-2; i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+",");
        }

    }
}
