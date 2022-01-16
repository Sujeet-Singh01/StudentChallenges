import java.io.FileInputStream;

public class FileInput2 {
    public static void main(String args[]) throws Exception
    {
        try(FileInputStream fis2=new FileInputStream("D:/JavaProjects/TestFile1.txt"))
        {
            int x;
            while((x=fis2.read())!=-1)
                System.out.println((char)x);

        }
    }
}

