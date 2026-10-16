import java.util.Scanner;
import java.io.*;
class Find{
    public static void main(String args[]) throws Exception{
        Scanner s=new Scanner(System.in);

        System.out.println("Enter 0 for delete");
        System.out.println("Enter 1 for dont delete ");
        Int userinput=s.nextInt();
      FileWriter fw=new FileWriter("StudentData/userInput.txt");
        if(userinput == 0){
            fw.delete();
            System.out.println("File is deleted");
        }
        else{
            System.out.println("File is not deleted");
        }
    }
}
