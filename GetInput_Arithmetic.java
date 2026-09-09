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
    System.out.println("Enter the a value:"+a);
    int b=obj.nextInt();
    System.out.println("Enter the b value:"+b);
    calculation value=new calculation();
    int x=value.add(a,b);
    int s=value.sub(a,b);
    int m=value.mul(x,s);
    int d=value.div(x,s);
    System.out.println("Additon"+x);
    System.out.println("Subtraction"+s);
    System.out.println("Multiple"+m);
    System.out.println("Divide"+d);
    }
}