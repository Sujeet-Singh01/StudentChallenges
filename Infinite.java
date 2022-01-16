class threadPractice extends Thread{
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count+"t");
            count++;
        }
    }
}
public class Infinite {
    public static void main(String args[])
    {
        threadPractice t=new threadPractice();
        t.start();
       int count=1;
       while(true)
        {
            System.out.println(count);
            count++;
        }
    }
}
