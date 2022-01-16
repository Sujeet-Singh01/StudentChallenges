import java.io.*;
public class ReadSerializedStream {
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis=new FileInputStream("D:\\JavaProjects\\Serialize.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        SerializeStudent ss=(SerializeStudent) ois.readObject();
        System.out.println(ss);
        fis.close();
        ois.close();

    }
}
