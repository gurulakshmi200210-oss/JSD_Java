import java.util.*;

class Find{
    public static void main(String args[]) {

        Queue<String> q = new LinkedList<String>();

    
        q.add("Mira");
        q.add("Simba");
        q.add("Meena");
        // q.add(11);

        System.out.println("Queue: " + q);

        
       
    
        System.out.println("Peek: " + q.peek());
        // System.out.println("Queue after peek(): " + q);

    
        System.out.println("Poll: " + q.poll());
        // System.out.println("Queue after poll(): " + q);
        for(String s: q)
        { 
        System.out.println(q);
        } 
    
        // System.out.println("Remove: " + q.remove());
        // System.out.println("Queue after remove(): " + q);
    }
}