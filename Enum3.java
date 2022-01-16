enum Dept2
{
    CS,IT,EC,ME,CIVIL;
}
public class Enum3 {
    public static void main(String args[])
    {
        Dept2 d=Dept2.ME;

        switch(d)
        {
            case CS:
                System.out.println("Name: Smith "+"\n"+"Block A");
                break;
            case EC:
                System.out.println("Name: John "+"\n"+"Block B");
                break;
            case ME:
                System.out.println("Name: Michael"+"\n"+"Block C");
        }
    }
}
