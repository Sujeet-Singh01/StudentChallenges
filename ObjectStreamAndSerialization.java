import java.io.*;
class SerializeStudent implements Serializable
{
    private int roll;
    private String name;
    private float average;
    private String dept;
    public static int data=10;
    transient int t;

    public SerializeStudent()
    {

    }
    public SerializeStudent(int rollNumber,String n,float avg,String d)
    {
        roll=rollNumber;
        name=n;
        average=avg;
        dept=d;
        data=200;
        t=300;
    }
    public String toString()
    {
        return "\n Student Details\n"+
                "\nRollNumber is "+roll+
                "\nName is "+name+
                "\nAverage is "+average+
                "\nDepartment is "+dept+
                "\nData is "+data+
                "\nTrans is "+t;

    }
}
public class ObjectStreamAndSerialization {
    public static void main(String args[]) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("D:\\JavaProjects\\Serialize.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        SerializeStudent s=new SerializeStudent(10,"John",75.85f,"CSE");

        oos.writeObject(s);
        fos.close();
        oos.close();
    }
}
