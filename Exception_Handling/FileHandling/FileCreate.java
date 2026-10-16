import java.io.*;
class FileCreate{
    public static void main(String args[]){
        try{
            File obj=new File("StudentData/Demo.txt");
            if(!(obj.exists())){
            obj.createNewFile();
            System.out.println("File Created..");
            }
            else{
            System.out.println("Already Exists");
            }
        System.out.println(obj.getName());
        System.out.println(obj.getAbsolutePath());
        System.out.println(obj.length());
        System.out.println(obj.canRead());
        System.out.println(obj.canWrite());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}