class parent
{
    public parent()
    {
        System.out.println("Parent class");
    }
}
class child extends parent{
    public child()
    {
        System.out.println("Child class");
    }
}
class grandChild extends child{
    public grandChild()
    {
        System.out.println("Grand Child");
    }
        }
public class ConstructInheritance {
    public static void main(String args[])
    {
        grandChild gc=new grandChild();
    }
}
