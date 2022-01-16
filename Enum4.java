enum Dept3 {
    CS, IT,CIVIL,EC;

    public void display()
    {
        System.out.println(this.name()+" "+this.ordinal());
    }
}
public class Enum4 {
    public static void main(String args[])
    {
        Dept3 d=Dept3.IT;
        d.display();
    }
}
