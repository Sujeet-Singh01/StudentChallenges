abstract class Shape
{
    abstract void  perimeter();
    abstract void area();

}
class Circles extends Shape{
    double radius;
    public Circles(double radius)
    {
        this.radius=radius;
    }
    void perimeter()
    {
        System.out.println("Perimeter of the circle is: "+2*Math.PI*radius);

    }
    void area()
    {
        System.out.println("Area of the circle is: "+Math.PI*radius*radius);
    }
}
class Rectangles extends Shape{
    private double  length;
    private double breadth;
    public Rectangles(double length,double  breadth)
    {
        this.length=length;
        this.breadth=breadth;

    }
    void perimeter()
    {
        System.out.println("Perimeter of the rectangle is: "+2*(this.length+this.breadth));

    }
    void area()
    {
        System.out.println("Area of the rectangle is: "+this.length*this.breadth);

    }
}
public class AbstractShape {
    public static void main(String args[])
    {
        Shape s=new Circles(15.3);
        s.perimeter();
        s.area();
        Shape sh=new Rectangles(5,10);
        sh.perimeter();
        sh.area();
    }
}
