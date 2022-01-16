import javax.swing.plaf.BorderUIResource;

class Thread01
{
    boolean flag;

    int value;

   synchronized public void set(int v)
    {
        if(flag!=true)
            try{wait();}catch(Exception e){}
        value=v;
            flag=false;
            notify();
    }
   synchronized public int get()
    {
        if(flag!=false)
            try{wait();}catch(Exception e){}
        int x=value;
            flag=true;
        notify();
        return x;

    }
}
class Producer01 extends Thread
{
    Thread01 thr;
    public Producer01(Thread01 t)
    {
        thr=t;
    }

    public void run()
    {
        int count=1;
        while(true)
        {
            thr.set(count);
            System.out.println("Producer: "+count);
            count++;
        }
    }
}
class Consumer01 extends Thread
{
    Thread01 thread;
    public Consumer01(Thread01 t)
    {
        thread=t;
    }
    public void run()
    {
        int num;
        while(true){
            num=thread.get();
            System.out.println("Consumer: "+num);
        }
    }
}
public class InterThread {
    public static void main(String args[])
    {
        Thread01 t=new Thread01();
        Producer01 p=new Producer01(t);
        Consumer01 c=new Consumer01(t);
        p.start();
        c.start();

    }
}
