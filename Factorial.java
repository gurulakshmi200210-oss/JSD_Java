import java.util.Scanner;
class Number{
    public int Fact(int num){
        int fact=1;
        for(int i=num;i>1;i--){
            fact*=i;
        }
        return fact;
    } 
}
class find{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        Number obj=new Number();
        int Factorial=obj.Fact(num);
        System.out.println(Factorial);

    }
}