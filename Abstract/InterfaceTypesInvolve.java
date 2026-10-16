import java.util.Scanner;
interface A1{
    abstract void add(int a, int b);

    abstract void sub(int a,int b);

    default void mul(int a, int b){
        int output=a*b;
        System.out.println("Mul:"+output);
    }

    static void div(int a,int b){
        int output=a/b;
        System.out.println("Div:"+output);
    }

    }
class A2 implements A1{
    public void add(int a,int b){
        int output=a+b;
        System.out.println("Add:"+output);
    }
    public void sub(int a,int b){
        int output=a-b;
        System.out.println("Sub:"+output);
    }

} 
class Find{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the 1st number:");
    int num1=s.nextInt(); 
    System.out.println("Enter the 2nd number:");
    int num2=s.nextInt();
        A2 obj=new A2();
        obj.add(num1,num2);
        obj.sub(num1,num2);
        obj.mul(num1,num2);
        A1.div(num1,num2);
    }
}