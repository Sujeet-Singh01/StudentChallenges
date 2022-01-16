enum Dept5
{
    CS("John","Block A"),IT("Smith","Block B"),EC("Enrique","Block C");
    String name;
    String location;
    private Dept5(String n,String block)
    {
        name=n;
        location=block;
    }
    public String getName()
    {
        return name;
    }
    public String getLocation()
    {
        return location;
    }
}
public class EnumParameterised {
    public static void main(String args[])
    {

        Dept5 d=Dept5.CS;
        System.out.println(d.getName());
        System.out.println(d.getLocation());
    }
}
