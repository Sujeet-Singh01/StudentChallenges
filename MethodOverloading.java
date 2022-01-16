import java.util.Scanner;
public class MethodOverloading {

    static int area(int l,int b)
    {
        return(l*b);
    }
    static double area(float r)
    {
        System.out.println("radius is : "+r);
        return(Math.PI*r*r);
    }
    public static void main(String args[])
    {
        System.out.println("Program to find out the areas: ");
        System.out.println("Enter the length and breadth of the rectangle: ");

        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int c=area(l,b);
        System.out.println("Enter the radius of the circle: ");
        float r=sc.nextInt();
        double ar=area(r);
        System.out.println("Area of rectangle is: "+c);
        System.out.println("Area of Circle is: "+ (int)ar);

    }
}
