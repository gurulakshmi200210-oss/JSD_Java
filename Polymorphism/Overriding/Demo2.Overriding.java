import java.util.Scanner;
class Number{
    public void add(int num1,int num2,int num3){
        int output=num1+num2+num3;
        System.out.println(output);

    }
}
class Mult extends Number{
    public void add(int num1,int num2, int num3){
        super.add(num1,num2,num3);
        int output=num1*num2*num3;
        System.out.println(output);
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1=s.nextInt();
        System.out.println("Enter the num2");
        int num2=s.nextInt();
        System.out.println("Enter the num3");
        int num3=s.nextInt();
        Mult obj=new Mult();
        obj.add(num1,num2,num3);


    }
}