import java.io.*;
public class ByteDemo {
    public static void main(String args[]) throws Exception
    {
        byte b[]={'a','b','c','d','e','f','g','h','i','j','k'};

        ByteArrayInputStream bis=new ByteArrayInputStream(b);

        int x;

        while((x=bis.read())!=-1)
            System.out.print((char)x+" ");

        bis.close();
    }
}
