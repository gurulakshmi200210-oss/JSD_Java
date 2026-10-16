// import java.util.Scanner;
class first extends Thread{
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
class second extends Thread{
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
        first obj2=new first();
        obj2.start();
        obj.start();
        second objj=new second();
        objj.run();
    }
}