public class ArrayRotation {
    public static void main(String[] args)
    {
        int A[]={5,9,6,10,12,7,3,5,4,2};
        int temp=A[0];
        for(int i=1; i<A.length; i++)
        {
            A[i-1] = A[i];

        }
        A[A.length - 1] = temp;
        for(int j=0;j<A.length;j++)
        {
            System.out.print(A[j]+", ");
        }
    }
}
