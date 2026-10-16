import java.util.Scanner;
import java.io.*;

class Find{
    public static void main(String args[])throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1-read \n Enter 2-write \n Enter 3-delete");
        int ch=s.nextInt();
        FileReader fr=new FileReader("StudentData/Name.txt");
        switch(ch){
            case 1:
                FileReader fr=new FileReader("StudentData/Demo.txt");
                int ch;
                while((ch= fr.read())!=-1){
                System.out.println((char)ch);
                }
                fr.close();
                break;
            case 2:
                FileWriter fw=new FileWriter("StudentData/Demo.txt");
                String data=s.nextLine();
                fw.write(data);
                fr.close();
                break;
            case 3:
                File f=new File("StudentData/Daata.txt");
                System.out.println("Confirm delete by 0 ");
                int uinput=s.nextInt();

                if(uinput == 0){
                    f.delete();
                }
                f.close();
                break;
            default :
            System.out.println("Exit");
              
        }
     

    }
}