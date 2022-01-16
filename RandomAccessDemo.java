import java.io.*;
public class RandomAccessDemo {
    public static void main(String args[]) throws Exception
    {
        RandomAccessFile rf=new RandomAccessFile("D:/JavaProjects/NewFile.txt","rw");

        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('d');
        rf.write('e');
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.seek(5);
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());
        rf.seek(rf.getFilePointer()+2);
        System.out.println((char)rf.read());





    }
}
