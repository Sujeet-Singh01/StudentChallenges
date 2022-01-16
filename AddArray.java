import com.sun.security.jgss.GSSUtil;

public class AddArray {
    public static void main(String args[])
    {
        int A[][]={{1,3,4},{5,6,7},{8,9,0}};
        int B[][]={{1,3,4},{5,6,7},{8,9,0}};
        int C[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0; j<3; j++)
            {
                C[i][j]=A[i][j]+B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
