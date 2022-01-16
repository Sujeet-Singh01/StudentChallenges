import java.util.Scanner;
public class ArithemeticProgression {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first term of the A.P. ");
        int a=sc.nextInt();
        System.out.println("Enter the common difference of the A.P. ");
        int d=sc.nextInt();
        System.out.println("Enter how many term you want ");
        int term=sc.nextInt();
        System.out.print("The A.P. is: "+a+", ");
        for (int i=1; i<term;i++)
        {

            a=a+d;

            System.out.print(a+", ");
        }
    }
}
