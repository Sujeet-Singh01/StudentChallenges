class rectan
{
    double length;
    double breadth;
    public rectan()
    {
        length=breadth=1;
    }
    public rectan(double l,double b)
    {
        length=l;
        breadth=b;
    }
}
class rectan1 extends rectan
{
    double height;
    public rectan1()
    {
        height=1;
    }
    public rectan1(double l,double b,double h)
    {
        super(l,b);
        height=h;
    }

}
public class Rec {
    public static void main(String args[])
    {
        rectan1 r=new rectan1(15.5,12.6,123.89);
    }
}
