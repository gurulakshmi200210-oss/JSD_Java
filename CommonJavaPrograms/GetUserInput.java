import java.util.Scanner;
class calculation{
    public int add(int a,int b){
        int c=(a+b);
     return(c);
    }
    public int sub(int a,int b){
        int c=(a-b);
     return(c);
    }
    public int mul(int a,int b){
        int c=(a*b);
     return(c);
    }
    public int div(int a,int b){
        int c=(a/b);
     return(c);
    }
}
class UserInput{
    public static void main(String args[]){
    Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    System.out.println("Print:"+a);
    int b=obj.nextInt();
    System.out.println("Print:"+b);
    calculation value=new calculation();
    int x=value.add(a,b);
    int s=value.sub(a,b);
    int m=value.mul(a,b);
    int d=value.div(a,b);
    System.out.println(x);
    System.out.println(s);
    System.out.println(m);
    System.out.println(d);
    }
}