import java.util.*;
public class Priority {
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(30);
        pq.add(40);
        pq.add(15);
        pq.add(10);
        pq.add(12);
        pq.add(35);
        pq.add(25);

        pq.forEach((x)-> System.out.println(x));
    }
}
