import java.util.*;
class Find{
    public static void main(String args[]){
        HashMap<Integer,String> q=new HashMap<>();
        q.put(1,"Mira");
        q.put(2,"Madhu");
        q.put(3,"Meena");
        // q.put("Madhan");
        for(Map.Entry <Integer,String> i: q.entrySet()){    
        System.out.println(i.getKey()+" "+i.getValue());    
        }  
   if(q.containsKey(1)){
    System.out.println(q.get(1));
   }
   else{
    System.out.println(q.getOrDefault(1,"HelloMadurai"));
   }



    }
}