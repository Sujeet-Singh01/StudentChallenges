class MyNewData01
{
    boolean flag=true;
    int value;
   synchronized public void set(int v)
    {
        while(flag!=true)
        try{wait();}catch(Exception e){}
        value=v;
        flag=false;
        notify();
    }
   synchronized public int get()
    {
        int x=0;
        while(flag!=false)
        try{wait();}catch(Exception e){}
        x=value;
        flag = true;
        notify();
        return x;



    }

}
class Producer extends Thread
{
    MyNewData01 data01;
    public Producer(MyNewData01 d)
    {
        data01=d;
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            data01.set(count);
            System.out.println("Producer "+count);
            count++;
        }
    }
}
 class Consumer extends Thread
 {
     MyNewData01 data;
     public Consumer(MyNewData01 d)
     {
         data=d;
     }
     public void run()
     {
         int value;
         while(true) {
             value = data.get();
             System.out.println("consumed value is " + value);
         }
     }
 }
public class InterThreadCommunication {
    public static void main(String args[])
    {
            MyNewData01 newdata=new MyNewData01();
            Producer p=new Producer(newdata);
            Consumer c=new Consumer(newdata);
            p.start();
            c.start();
    }
}
