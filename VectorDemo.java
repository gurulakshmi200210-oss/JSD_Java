import java.util.*;
class Find{
    public static void main(String args[]){
        Vector v1=new Vector();
        v1.add("Python");
        v1.add("Java");
        v1.add("Jira");
        Vector v2=new Vector();
        v2.add("snake");
        v2.add("coffee");
        v2.add("seed");

        v1.addAll(v2);
        System.out.println(v1);
        System.out.println(v1.size());

    }

}