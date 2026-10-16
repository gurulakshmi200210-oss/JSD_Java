// import java.util.Scanner;
interface A{
    abstract void show();
}
interface B{
    abstract void display();
}
class Test implements A,B{
    public void show(){
        System.out.println("show");
    }
    public void display(){
        System.out.println("display");
    }
}
class Find{
    public static void main(String args[]){
        Test obj=new Test();
        obj.show();
        obj.display();
    }
}