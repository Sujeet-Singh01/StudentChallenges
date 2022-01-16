import java.util.Scanner;
public class GCD{
    static void change(int a,int b)
    {
        int num=0;
        if(a>b)
        {
             num=a;
        }
        else num=b;
        for(int i=2; i<num/2;i++) {
            if (a > b) {
                a = a - b;
            } else if (b > a) {
                b = b - a;
            }
        }
         if (a == b) {
        System.out.println("The GCD of the number is: " + a);

    }
         else
         {
             System.out.println("GCD is not found ");
         }
    }
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            change(a,b);

        }
}