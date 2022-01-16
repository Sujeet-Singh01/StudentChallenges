import java.io.FileInputStream;
import java.io.FileOutputStream;

public class NewSource {
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis=new FileInputStream("D:/JavaProjects.Source1.txt");
        FileOutputStream fos=new FileOutputStream("D:/JavaProjects.Source2.txt");

        int x;

        while((x=fis.read())!=-1)
        {
            if(x>=65 && x<=90) fos.write(x+32);
            else fos.write(x);
        }


    }
}
