import java.util.Scanner;
class OverloadingLogic{
    public int Add(int num1, int num2){
        int output=num1+num2;
        return output;
    }
    public double Add(double num1, double num2){
        double output=num1+num2;
        return output;
    }
    public int Add(int num1, int num2,int num3){
        int output=num1+num2+num3;
        return output;
    }
    public double Add(double num1, double num2,double num3){
        double output=num1+num2;
        return output;
    }
}
class calculation{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        // double number1=s.nextDouble();
        int num2=s.nextInt();
        // double number2=s.nextDouble();
        int num3=s.nextInt();
        // double number3=s.nextDouble();
        OverloadingLogic obj=new OverloadingLogic();
        int Addition=obj.Add(num1,num2,num3);
        // double Addition1=obj.Add(num1,num2,num3);
        System.out.println(Addition);
    }
}