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
class MulCalculation extends AddCalculation {

    public int mul(int num1, int num2){
        int output=(num1*num2);
        return output;
    }
}
class DivCalculation extends AddCalculation{
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
        System.out.println("Enter your choice--1,2,3,4");
        int ch=s.nextInt();

        SubCalculation obj1=new SubCalculation();
        MulCalculation obj2=new MulCalculation();
        DivCalculation obj3=new DivCalculation();

        int Addvalue=obj1.add(num1,num2);
        int Subvalue=obj1.sub(num1,num2);
        int Mulvalue=obj2.mul(Addvalue,Subvalue);
        int Divvalue=obj3.div(Addvalue,Subvalue);

        switch(ch){
            case 1:
            System.out.println("Addition:"+Addvalue);
            break;

            case 2:
                System.out.println("subtraction:"+Subvalue);
                break;

            case 3:
                System.out.println("Multiplication:"+Mulvalue);
                break;

            case 4:
                System.out.println("Divided:"+Divvalue);
                break;





        }

        
        
       
    }
}