class WhiteBoard05
{
    String text;
    int noOfStudents=0;
    int count=0;
    public void attendance()
    {
        noOfStudents++;
    }
    synchronized public void write(String t)
    {
        System.out.println("Teacher is Writing "+t);
        while(count!=0)
        try{wait();}catch(Exception e){}
        text=t;
        count=noOfStudents;
        notifyAll();
    }
    synchronized public String read()
    {
        while(count==0)
            try{wait();}catch(Exception e){}
        String t=text;
            count--;
            if(count==0)
            notify();
            return t;
    }
}
class Teacher05 extends Thread
{
    WhiteBoard05 wb;
    public Teacher05(WhiteBoard05 w)
    {
        wb=w;
    }
    String note[]={"Java is a programming language","Java supports multithreading",
    "It is OOPs","End"};
    public void run()
    {
        for(int i=0;i<note.length;i++)
        {
            wb.write(note[i]);
        }
    }
}
class Student05 extends Thread
{
    WhiteBoard05 wb;
    String name;
    public Student05(String s,WhiteBoard05 w)
    {
        wb=w;
        name=s;
    }

    public void run()
    {
        wb.attendance();
        String text;
        do
        {
            text=wb.read();
        System.out.println(name+" is Writing "+text);
        System.out.flush();}
        while(!text.equals("End"));
    }
}
public class InterThreadCommmunication {
    public static void main(String args[])
    {
        WhiteBoard05 wb=new WhiteBoard05();
        Teacher05 t=new Teacher05(wb);
        Student05 s1=new Student05("name 1",wb);
        Student05 s2=new Student05("name 2",wb);
        Student05 s3=new Student05("name 3",wb);
        t.start();
        s1.start();
        s2.start();
        s3.start();


    }
}
