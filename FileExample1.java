import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample1 {
    public static void main(String args[])
    {
        try {
            FileOutputStream fos = new FileOutputStream("D:/JavaProjects/TestFile1.txt");
            String str="Java is a Object Oriented Programming Language";

            byte s[]=str.getBytes();
            for(byte x:s)
            {
                fos.write(s,10,2);
            }
            fos.write(str.getBytes());
            fos.close();


        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}
