public class MaxOfArray {
    public static void main(String[] args)
    {
        int B[]={1,34,45,665,45,3434,5455,6566,665,654,5454,4565};
        int max=0;
        for(int i=0;i<B.length;i++)
        {
            if(B[i]>max)
            {
                max=B[i];
            }
        }
        System.out.println("Maximum value of this array is: "+max);

    }
}
