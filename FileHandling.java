import java.io.*;
public class FileHandling {
    public static void main(String args[])
    {
        File f=new File("D:\\JavaProjects");
        System.out.println(f.isDirectory());

        File list[]=f.listFiles();

        for(File x:list)
        {
            System.out.print(x.getName()+"    ");
            System.out.println(x.getPath());

        }

    }
}
