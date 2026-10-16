// import java.util.Scanner;
class first implements Runnable {
    public void run(){
        try{
        int num=10;
        for(int i=0;i<=num;i++){
            System.out.println("First"+Thread.currentThread().getName()+i);
            Thread.sleep(1000);
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class second implements Runnable{
    public void run(){
        try{
        int num1=10;
        for(int i=0;i<=num1;i++){
            System.out.println("Second"+Thread.currentThread().getName()+i);
            Thread.sleep(1000);
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class Find{
    public static void main(String args[]){
        
        first obj=new first();
       
        Thread t1=new Thread(obj);
        // t1.setName("Zirah");
        // t1.setPriority(max_priority);
         t1.start();
        second objj=new second();
        Thread t2=new Thread(objj);
        // t2.setPriority(MAX PRIORITY());
        t2.run();
    }
}
