import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrList {
    public static void main(String args[])
    {
        ArrayList<Integer> al1=new ArrayList<>(20);
        ArrayList<Integer> al2=new ArrayList(List.of(23,45,67,88,90));
        al1.add(20);
        al1.add(0,30);
        al1.addAll(0,al2);
        System.out.println(al1.contains(45));
        System.out.println(al1.get(4));
        System.out.println(al1.indexOf(45));
        System.out.println(al1);
        for(int i=0;i<al1.size();i++)
        {
            System.out.println(al1.get(i));
        }

        for(Integer x:al1)
        {
            System.out.println(x);
        }
        System.out.println("Using var: ");
        for(var x:al1)
            System.out.println(x);

        System.out.println("Using for iterator: ");
        for(Iterator<Integer> it= al1.iterator(); it.hasNext();/*updation part is not there*/)
        {
            java.lang.Integer x=it.next();
            System.out.println(x);

        }
        System.out.println("Using lamda Expression: ");
        al1.forEach((x)-> {System.out.println(x);});

        System.out.println("Using Iterator");   //Allows only in forward direction

        Iterator<Integer> it=al1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("Using list iterator "); // Allows bi-directional access
        ListIterator<Integer> li=al1.listIterator();
        while(li.hasNext())
        {
            System.out.println(li.next());
        }
    }
}
