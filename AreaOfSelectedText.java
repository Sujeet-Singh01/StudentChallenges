import java.util.Scanner;
public class AreaOfSelectedText {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str=sc.nextLine();
        int noOfCharacters=str.length();    //Default width=1;
        int max_height=0;
        int height[]={1,1,1,2,4,2,3,4,2,5,3,4,2,3,1,4,5,3,2,1,5,1,1,4,4,2};

        for(int i=0; i<str.length(); i++)
        {
            int idx= str.charAt(i)-'a';
            if(height[idx]>max_height)
            {
                max_height=height[idx];
            }
        }
        System.out.println("Area is: "+noOfCharacters*max_height);


    }
}
