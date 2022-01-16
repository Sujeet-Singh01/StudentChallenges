import java.util.Scanner;
public class FromatS {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str="";
        int x=0;
        System.out.println("=============================");
        for(int i=0; i<3; i++) {
           str = sc.next();
           x = sc.nextInt();
            System.out.printf("%-10s %3d",str,x);

        }


        System.out.println("=============================");

    }
}
