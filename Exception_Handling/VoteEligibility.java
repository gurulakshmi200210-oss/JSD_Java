import java.util.Scanner;
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter your age:");
        int age=s.nextInt();
       
        
        if(age >=18){
            System.out.println("you are Eligible for Vote");
        }
        else{
            throw new ArithmeticException("you are child now");
        }
        
    }
}
