class WhiteBoard
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
        {
            try{wait();}catch(Exception e){}
        }
        text=t;
        count=noOfStudents;
        notifyAll();
    }
   synchronized public String read()
    {
        String t;
        while(count==0)
        {
            try{wait();}catch(Exception e){}
        }
        t=text;
        count--;
        if(count==0)
        notify();
        return t;
    }
}
class Teacher extends Thread
{
        WhiteBoard wb;
        String note[]={"Java is Programming language","Java supports OOPs","It is platform independant","" +
                "It supports multithreading"+"End"};
        public Teacher(WhiteBoard w)
        {
            wb=w;
        }
        public void run()
        {
            for(int i=0;i<note.length;i++)
                wb.write(note[i]);
        }
}
class Student02 extends Thread
{
    String name;
    WhiteBoard wb;
    public Student02(String n,WhiteBoard w)
    {
        name=n;
        wb=w;
    }
    public void run()
    {
        wb.attendance();
        String text;
        do {
            text=wb.read();
            System.out.println(name+" writing "+text);
            System.out.flush();
        }while(!text.equals("End"));
    }
}
public class InterThreadChallenge {
    public static void main(String args[])
    {
        WhiteBoard wb=new WhiteBoard();
        Teacher t=new Teacher(wb);
        Student02 st=new Student02("Sujeet",wb);
        Student02 st1=new Student02("Sujal",wb);
        t.start();

        st.start();
        st1.start();
    }
}
