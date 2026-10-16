import java.util.Scanner;
class A1{
    public void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
}
class A2 extends Thread{
    public void run(int a,int b){ 
    System.out.println("print");
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        A1 obj1=new A1();
        obj1.add(a,b);
        A2 obj2=new A2(a,b);
        obj2.run(a,b);
    }
}