import java.io.FileInputStream;

public class FileInput1 {
    public static void main(String args[]) throws Exception
    {
        try
                (FileInputStream fis1=new FileInputStream("D:/JavaProjects/TestFile1.txt"))
        {
            int x;
            do {
                x=fis1.read();
                if(x!=-1)
                System.out.print((char)x);
            }while(x!=-1);
        }
    }
}
