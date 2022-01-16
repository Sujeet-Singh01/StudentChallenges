import java.io.*;
public class DataOutputChallenge {
    public static void main(String args[]) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("D:\\JavaProjects\\NewChallenge.txt");
        DataOutputStream dos=new DataOutputStream(fos);

        float list[]={10.5f,12.23f,23.54f,56.43f};
        dos.write(list.length);
        for(float fl:list)
        {
            dos.writeFloat(fl);
        }
        dos.close();
        fos.close();



    }
}
