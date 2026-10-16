import java.util.*;
class Find{
    public static void main(String args[]){
        // Vector v=new Vector();
        // LinkedList v=new LinkedList();
        // HashSet v=new HashSet();
        // LinkedHashSet v=new LinkedHashSet();
        TreeSet v=new TreeSet();
        v.add("Hello");
        v.add("Java");
        // v.add(50);
        // v.add(null);
        System.out.println(v);
        if(v.contains("Java")){
            System.out.println("Founded");
        }
        else{
            System.out.println("NotFound");
        }
        Iterator itr=v.iterator();
        while(itr.hasNext()){
         System.out.println(itr.next());
        }
    }
}