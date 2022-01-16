class Calculate<T extends Number>
{
    T[] newArray;
    public Calculate(T[] arr)
    {
        newArray=arr;
    }
    public double average()
    {
        double sum=0;
        for(int i=0;i< newArray.length;i++)
        {
            sum +=newArray[i].doubleValue();
        }
        return sum/ newArray.length;
    }
}
public class NewGen05 {
    public static void main(String args[])
    {
            Integer num[]={12,34,22,45,23};
            Calculate<Integer> cl=new Calculate<Integer>(num);
            double result=cl.average();
        System.out.println(result);
    }
}
