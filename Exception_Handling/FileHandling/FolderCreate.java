import java.io.*;
class FolderCreate{
    public static void main(String args[]){
        try{
            File obj=new File("StudentData");
            obj.mkdir();
            System.out.println("Folder Created..");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}