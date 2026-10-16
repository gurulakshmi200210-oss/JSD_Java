// import java.util.Scanner;
class A1{
    String name;
    int price;
    public A1(){
        name="Welcome";
    }
    public A1(String name){
        this.name=name;
        
    }
    public A1(String name,int price){
        this.name=name;
        this.price=12;
    }
    public void display(){
        System.out.println(name+price);
    }
}
class A2{
    public static void main(String args[]){
        A1 obj=new A1("Java",90);
        obj.display();
        
    }
}