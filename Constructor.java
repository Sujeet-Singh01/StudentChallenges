class Rectangle
{
    private double length;
    private double breadth;

    public Rectangle()
    {
       length=1;
       breadth=1;
    }
    public Rectangle(double l,double b)
    {
        setLength(l);
        setBreadth(b);
    }
    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    public void setLength(double l)
    {
        if (l>=0)
           length=l;
        else
           length=0;
    }
    public void setBreadth(double b)
    {
        if(b>=0)
            breadth=b;
        else
            breadth=0;
    }
    public double area()
    {
        return length*breadth;
    }
}
public class Constructor {
    public static void main(String args[])

    {
        Rectangle r=new Rectangle(5,9);
        System.out.println("Area is: "+r.area());
    }

}
