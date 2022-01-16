abstract class My1
{
    abstract void display();
}

public class Anonymous {
    public static void main(String args[])
    {
        new My1()
        {
          public void display()
          {
              System.out.println("This is main display");
          }
        }.display();

    }
}
