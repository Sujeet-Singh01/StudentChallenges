import java.io.*;
public class ReadWrite {
    public static void main(String args[]) {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\saten\\OneDrive\\Desktop\\Test\\output.txt")
            );
            bw.write("My name is:\n");
            bw.write("Sujeet\n");
            bw.write("Singh");
            bw.close();

        }catch(Exception es)
        {
            return;
        }
    }
}
