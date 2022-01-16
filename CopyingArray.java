public class CopyingArray {
    public static void main(String[] args)
    {
        int A[]= {1,0,2,9,3,8,4,7,5,6};
        int B[]= new int [10];
        System.out.print("Old B is: ");
        for(int j=0; j<B.length; j++)
        {
            System.out.print(B[j]);
        }
        for(int i=0; i<A.length; i++)
        {
            B[i]=A[i];
        }
        System.out.print("new B is: ");
        for(int i=0; i<A.length; i++)
        {
            System.out.print(B[i]);
        }

    }
}
