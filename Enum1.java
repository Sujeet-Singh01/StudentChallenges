enum Dept
{
    CS,IT,EC,CIVIL
}
public class Enum1 {
    public static void main(String args[])
    {
        Dept d=Dept.CS;
        Dept list[]=Dept.values();
        for(Dept dp:list)
        {
            System.out.println(dp);
        }
    }
}
