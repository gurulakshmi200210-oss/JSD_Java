import java.util.Scanner;
import java.util.InputMismatchException;
class Number{
    public void div(int a,int b){
        try{
        int c=a/b;
        System.out.println(c);
        }
        // catch(InputMismatchException e){
        //     System.out.println("Please Enter the Non-Zero Number");
        // }
        catch(ArithmeticException e){
            System.out.println("Please Enter Non-Zero Numbers");
        }
        catch(Exception e){
            System.out.println("Ohh bro.. Your System's Mistake");
        }
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("Please Enter the first Number: ");
            int a=s.nextInt();
            System.out.println("Please Enter the next Number: ");
            int b=s.nextInt();
            Number obj=new Number();
            obj.div(a,b);
        }
         catch(InputMismatchException e){
            System.out.println("Please Enter the only Number");
        }
        finally{
            System.out.println("code Executed");
        }
        
    }
}