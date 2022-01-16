import java.io.*;
public class ByteDemo2 {

    public static void main(String args[]) throws Exception
    {
        byte b[]={'a','b','c','d','e','f','g','h','i','j','k'};
        ByteArrayInputStream bis=new ByteArrayInputStream(b);

        String str=new String(bis.readAllBytes());
        System.out.println(str);
        bis.close();
    }
}
