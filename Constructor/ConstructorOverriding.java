import java.util.Scanner;
class A1{
    public A1(){
        System.out.println("Hello");
    }
}
class A2 extends A1{
    public A2(){
        super();
        System.out.println("Welcome");
    }
}
class Find{
    public static void main(String args[]){
        A2 obj=new A2();
        
    } 
}