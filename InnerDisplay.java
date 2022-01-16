import java.sql.SQLOutput;

class Outer
{
    int x=10;

    class Inner
    {
        int y=20;
        public void display()
        {
            System.out.println("value of outer class property: "+x);
            System.out.println("Inner class display");
        }
    }
    public void outerDisplay()
    {
        Inner i=new Inner();
        i.display();
        System.out.println("Value of inner class property is: "+i.y);

    }
}
public class InnerDisplay {
    public static void main(String args[])
    {
        Outer o=new Outer();
        o.outerDisplay();
        Outer.Inner oi=new Outer().new Inner();
        oi.display();

    }
}
