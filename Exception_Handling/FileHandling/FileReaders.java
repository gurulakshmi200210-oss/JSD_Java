import java.io.*;
class FileReaders{
    public static void main(String args[]){
        try{
        FileWriter fw=new FileWriter("StudentData/Demo.txt",true);
        fw.write("welcome to java\n");
        fw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}