import java.io.FileInputStream;

public class FileInput {
    public static void main(String args[]) throws Exception
    {

        try (FileInputStream fis = new FileInputStream("D:/JavaProjects/TestFile1.txt")){

            byte b[]=new byte[fis.available()];
            fis.read(b);
            String str=new String(b);
            System.out.println("String is: "+str);

        }







    }
}
