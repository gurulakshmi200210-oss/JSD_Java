import java.util.Scanner;
class A1{
    public A1(String name){
        System.out.println(name+"Hello");
    }
}
class A2 extends A1{
    public A2(String name){
        super(name);
        System.out.println("Welcome");
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=s.nextLine();
        A2 obj=new A2(name);
        
    } 
}