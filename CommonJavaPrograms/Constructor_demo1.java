import java.util.Scanner;
class Constructor{
    int a;
    int b;
    public Constructor(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void add(){
        int c=a+b;
        System.out.println(c);
    

    }
    public void sub(){
        int c=a-b;
        System.out.println(c);

    }
    public void mul(){
        int c=a*b;
        System.out.println(c);

    }
    public void div(){
        int c=a/b;
        System.out.println(c);

    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the X value: ");
        int a=s.nextInt();
        System.out.println("Enter the Y value: ");
        int b=s.nextInt();
        Constructor obj=new Constructor(a,b);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();

    }
}