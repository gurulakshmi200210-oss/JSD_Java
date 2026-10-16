abstract class A1{
    abstract void add(int a, int b);
    abstract void sub(int a,int b);
    void mult(int a, int b){
        int output=a*b;
        System.out.println("Mul:"+output);
    }
    void div(int a,int b){
        int output=a/b;
        System.out.println("Div:"+output);
    }
    }
class A2 extends A1{
    void add(int a,int b){
        int output=a+b;
        System.out.println("Add:"+output);
    }
    void sub(int a,int b){
        int output=a-b;
        System.out.println("Sub:"+output);
    }
} 
class Find{
    public static void main(String args[]){
        A2 obj=new A2();
        obj.add(2,4);
        obj.sub(7,5);
        obj.mult(2,3);
        obj.div(4,2);
    }
}
