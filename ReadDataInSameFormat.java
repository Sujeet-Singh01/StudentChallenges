import java.io.*;
public class ReadDataInSameFormat {
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis=new FileInputStream("D:/JavaProjects/My1.txt");
        NewStudent s=new NewStudent();
        DataInputStream d=new DataInputStream(fis);

        s.roll=d.readInt();
        s.name=d.readUTF();
        s.dept=d.readUTF();

        System.out.println("Roll number is "+s.roll);
        System.out.println("Name is "+s.name);
        System.out.println("Department is "+s.dept);

        fis.close();
        d.close();

    }
}
