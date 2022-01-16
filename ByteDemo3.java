import java.io.*;
public class ByteDemo3 {
    public static void main(String args[]) throws Exception
    {
        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');
        bos.write('f');

        bos.writeTo(new FileOutputStream("D:/JavaProjects/NewFile.txt"));

        byte b[]=bos.toByteArray();
        for(byte x:b)
            System.out.println((char)x);
        bos.close();
    }
}
