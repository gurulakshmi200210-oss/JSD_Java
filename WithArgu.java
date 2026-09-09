class Add{
    public void add(int a, int b){
        int c=a+b;
        System.out.println("Addition"+c);
    }
    public void sub(int a, int b){
        int c=a-b;
        System.out.println("Subtraction"+c);
    }
    public void mul(int a, int b){
        int c=a*b;
        System.out.println("Multiple"+c);
    }
    public void div(int a, int b){
        int c=a/b;
        System.out.println("Divide"+c);
    }
}
class B1{
    public static void main(String args[]){
        int a=10;
        int b=30;
       Add obj=new Add();
       obj.add(a,b); 
       obj.sub(a,b);
       obj.mul(a,b);
       obj.div(a,b);
    }
}


