import java.io.*;
public class BufferInput {
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis=new FileInputStream("D:/JavaProjects/Buffer.txt");

        BufferedInputStream bis=new BufferedInputStream(fis);

        System.out.print((char) bis.read()+" ");
        System.out.print((char) bis.read()+" ");
        System.out.print((char) bis.read()+" ");
        System.out.print((char) bis.read()+" ");
        System.out.print((char) bis.read()+" ");
        System.out.print((char) bis.read()+" ");
        bis.mark(20);
        System.out.print((char) bis.read()+" ");
        System.out.print((char) bis.read()+" ");
        bis.reset();
        System.out.print((char) bis.read()+" ");
        System.out.print((char) bis.read()+" ");
        bis.close();

    }
}
