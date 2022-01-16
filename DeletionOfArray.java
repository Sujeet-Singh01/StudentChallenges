import java.sql.SQLOutput;
import java.util.Scanner;
public class DeletionOfArray {
    public static void  main(String args[])
    {
        int A[]={2,6,45,78,90,21};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index where you want to delete the number");
        int index=sc.nextInt();
        for(int i=index; i<A.length-2; i++) {
            A[i] = A[i + 1];
        }
        for( int i=0; i<A.length; i++)
        {
            System.out.print(A[i]+", ");
        }
    }
}
