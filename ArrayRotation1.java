import java.util.Scanner;
public class ArrayRotation1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        int A[]=new int[10];
        A[0]=2;
        A[1]=3;
        A[2]=9;
        A[3]=8;
        A[4]=7;
        A[5]=6;
        System.out.println("Enter the place at which you want to DELETE: ");
        int delete=sc.nextInt();
        delete=delete-1;
        for(int i=delete; i<A.length-1;i++)
        {
            A[i]=A[i+1];
        }
        System.out.println("The new array is: ");
        for(int i=0; i<A.length-1;i++)
        {
            System.out.print(A[i]+" ");
        }


    }
}
