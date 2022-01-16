import java.io.*;
class PipedProducer extends Thread
{
    OutputStream os;
    public PipedProducer(OutputStream o)
    {
        os=o;
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            try{
                os.write(count);
                os.flush();

                System.out.println("Producer "+count);
                System.out.flush();
                Thread.sleep(10);
                count++;
            }catch(Exception e){}
        }
    }

}
class PipedConsumer extends Thread
{
    InputStream is;
    public PipedConsumer(InputStream s)
    {
        is=s;
    }
    public void run()
    {
        int x;
        while(true)
        {

            try{
                x=is.read();
                System.out.println("Consumer "+x);
                System.out.flush();
                Thread.sleep(10);
            }catch(Exception e){}
        }
    }
}
public class PipedStream {
    public static void main(String args[]) throws Exception
    {
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();
        pis.connect(pos);
        PipedProducer p=new PipedProducer(pos);

        PipedConsumer c=new PipedConsumer(pis);

        p.start();
        c.start();

    }
}
