interface MyNewInterface
{
    public void display();
}
class useLamda
{
    public void callLamda(MyNewInterface n)
    {
        n.display();

    }
}
class demo
{
    public void demomethod()
    {
        useLamda l=new useLamda();
        l.callLamda(()->{
            System.out.println("Hello World");
        });
    }
}
public class LamdaExpression5 {
    public static void main(String args[])
    {
        demo d=new demo();
        d.demomethod();

    }
}
