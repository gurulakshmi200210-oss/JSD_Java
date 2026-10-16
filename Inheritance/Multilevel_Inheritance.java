import java.util.Scanner;
class AddCalculation{
    public int add(int num1, int num2){
        int output=(num1+num2);
        return output;
    }
}
class SubCalculation extends AddCalculation{
    public int sub(int num1, int num2){
        int output=(num1-num2);
        return output;
    }
    
}
class MulCalculation extends SubCalculation {

    public int mul(int num1, int num2){
        int output=(num1*num2);
        return output;
    }
}
class DivCalculation extends MulCalculation{
    public int div(int num1, int num2){
        int output=(num1/num2);
        return output;
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int num1=s.nextInt();
        System.out.println("Enter the Second Number:");
        int num2=s.nextInt();
        DivCalculation obj=new DivCalculation();
        int Addvalue=obj.add(num1,num2);
        int Subvalue=obj.sub(num1,num2);
        int Mulvalue=obj.mul(Addvalue,Subvalue);
        int Divvalue=obj.div(Addvalue,Subvalue);
        System.out.println("Addition:"+Addvalue);
        System.out.println("subtraction:"+Subvalue);
        System.out.println("Multiplication:"+Mulvalue);
        System.out.println("Divided:"+Divvalue);
        
    }
}