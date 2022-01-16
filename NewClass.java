import java.util.Scanner;
public class NewClass {
    public static void main(String args[])
    {
        System.out.println("Enter the day number: ");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        String day="";
        switch (n)
        {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
