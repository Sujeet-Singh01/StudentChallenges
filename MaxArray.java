public class MaxArray {
    static int max(int A[])
    {
        int max1=A[0];
        for(int i=1;i<A.length;i++)
        {
            if(A[i]>max1)
            {
                max1=A[i];
            }
        }
        return max1;
    }
    public static void main(String args[])
    {
        int A[]={5,3,6,12,45,76,134,87,99,43,54,11,66,78};
        System.out.println(max(A));
    }
}
