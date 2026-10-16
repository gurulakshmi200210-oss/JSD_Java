import java.util.Scanner;
class AddSubCalculation{
    public int add(int num1, int num2){
        int output=(num1+num2);
        return output;
    }
    
    public int sub(int num1, int num2){
        int output=(num1-num2);
        return output;
    }
    
}
class MulDivCalculation extends AddSubCalculation{

    public void mul(int num1, int num2){
        int output=(num1*num2);
        System.out.println("Multiplication:"+output);
    }
    public void div(int num1, int num2){
        int output=(num1/num2);
        System.out.println("Divided:"+output);
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int num1=s.nextInt();
        System.out.println("Enter the Second Number:");
        int num2=s.nextInt();
        MulDivCalculation obj=new MulDivCalculation();
        int Addvalue=obj.add(num1,num2);
        int Subvalue=obj.sub(num1,num2);
        obj.mul(Addvalue,Subvalue);
        obj.div(Addvalue,Subvalue);
        System.out.println("Addition:"+Addvalue);
        System.out.println("subtraction:"+Subvalue);
        
    }
}