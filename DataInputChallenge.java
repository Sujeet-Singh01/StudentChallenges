import java.io.*;
public class DataInputChallenge {
    public static void main(String args[])throws Exception
    {
        FileInputStream fis=new FileInputStream("D:\\JavaProjects\\NewChallenge.txt");
        DataInputStream dis=new DataInputStream(fis);

         int len=dis.readInt();
        System.out.println("No of integers are: "+len);
         float data;
         for(int i=0;i<len;i++)
         {
             data=dis.readFloat();
             System.out.println(data);
         }
         dis.close();
         fis.close();


    }
}
