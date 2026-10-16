interface A1{
    abstract void add(int a, int b);
    abstract void sub(int a,int b);
    abstract void mul(int a,int b);
    abstract void div(int a,int b);
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
    public void mul(int a, int b){
        int output=a*b;
        System.out.println("Mul:"+output);
    }
    public void div(int a,int b){
        int output=a/b;
        System.out.println("Div:"+output);
    }
} 
class Find{
    public static void main(String args[]){
        A2 obj=new A2();
        obj.add(2,4);
        obj.sub(7,5);
        obj.mul(2,3);
        obj.div(4,2);
    }
}