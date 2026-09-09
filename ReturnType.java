class Add{
    public int add(int a, int b){
        int c=a+b;
        return c;
    }
    public int sub(int a, int b){
        int c=a-b;
        return c;
    }
    public int mul(int a, int b){
        int c=a*b;
        return c;
    }
    public int div(int a, int b){
        int c=a/b;
        return c;
    }
}
class B1{
    public static void main(String args[]){
        int a=10;
        int b=30;
       Add obj=new Add();
       int Addition=obj.add(a,b); 
       int Subtraction= obj.sub(a,b);
       int Multiple=obj.mul(a,b);
       int Divide=obj.div(a,b);
       System.out.println("Add"+Addition);
       System.out.println("sub"+Subtraction);
       System.out.println("Mul"+Multiple);
       System.out.println("Div"+Divide);

       
    }
}


