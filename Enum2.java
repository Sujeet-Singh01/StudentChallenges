enum Dept1
{
    CS,IT,CIVIL,EC;
    private Dept1()
    {
        System.out.println(name());
    }
}
public class Enum2 {
    public static void main(String args[])
    {
            Dept1 d=Dept1.EC;
    }
}
