import java.util.Scanner;
import java.io.*;
import java.time.*;
class Find{
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);

        System.out.println("Enter Name");
        String name=s.nextLine();

        System.out.println("Enter age");
        int age=s.nextInt();
         
        System.out.println("Enter Email");
        String email=s.next();

        
        try{
        FileWriter f=new FileWriter("StudentData/userInput.txt");
            LocalDate d=LocalDate.now();
            f.write("name:"+name+"\n"+"age:"+age+"\n"+"Email:"+email+"\n"+"Date:"+d);
            f.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

        

    }
}