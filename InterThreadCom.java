class BlackBoard
{
    String text;
    int count=0;
    int no_of_student=0;
    public void attendance()
    {
        no_of_student++;
    }
    synchronized public void write(String t)
    {
        System.out.println("Teacher is Writing "+t);
        while(count!=0)
            try{wait();}catch(Exception e){}

        text=t;
        count=no_of_student;
        notifyAll();
    }
   synchronized public String read()
    {

        while(count==0)
        {
            try{wait();}catch(Exception e){}
        }
        String s;
        s=text;
        count--;
        if(count==0)
            notify();
        return s;
    }
}
class Teacher0 extends Thread
{
    String note[]={"Java","C++","Python","C#","End"};
    BlackBoard bb;
    public Teacher0(BlackBoard b)
    {
        bb=b;
    }
    public void run()
    {
        for(int i=0;i<note.length;i++)
            bb.write(note[i]);
    }


}
class Student0 extends Thread {
    BlackBoard bb;
    String name;

    public Student0(BlackBoard b, String s) {
        bb = b;
        name = s;
    }

    public void run()
    {
        bb.attendance();
        String s;
        do {
            s=bb.read();
            System.out.println(name + " is writing " + s);
            System.out.flush();
        }while(!s.equals("End"));
    }
}
public class InterThreadCom {
    public static void main(String args[])
    {
            BlackBoard bb=new BlackBoard();
            Teacher0 t=new Teacher0(bb);
            Student0 s1=new Student0(bb,"name");
            Student0 s2=new Student0(bb,"name1");
            Student0 s3=new Student0(bb,"Name 3");
            t.start();
            s1.start();
            s2.start();
            s3.start();

    }
}
