import java.util.Scanner;
import java.math.*;
public class Loop {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int numberOfTimes=sc.nextInt();
        for(int i=0; i<numberOfTimes; i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int sum=0;
            for(int j=0; j<n; j++)
            {

                int s=sum+a+((int)(Math.pow(2,j))*b);
                System.out.print(s+ " ");
                sum=s;

            }

        }
    }
}
