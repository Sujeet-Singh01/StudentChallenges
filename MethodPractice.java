
public class MethodPractice {


        void change(int A[],int index, int value)
        {
            A[index]=value;
        }



    public static void main(String args[])
    {
        int A[]={1,4,7,12,34};
        MethodPractice mp=new MethodPractice();
        mp.change(A,2,67);
        for(int x:A)
        {
            System.out.print(x+" ");
        }
    }
}
