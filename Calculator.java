import java.util.*;
public class Calculator {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        int a=sc.nextInt();
        String operator=sc1.next();
        switch(operator)
        {
            case "+": int b=sc.nextInt();
                System.out.println("Result: "+(a+b));
                break;
            case "-":  b=sc.nextInt();
                System.out.println("Result: "+(a-b));
                break;
            case "*":  b=sc.nextInt();
                System.out.println("Result: "+(a*b));
                break;
            case "/":  b=sc.nextInt();
                System.out.println("Result: "+(a/b));
                break;
            default:
                System.out.println("Mtlb kuch bhi ");

        }


    }
}
