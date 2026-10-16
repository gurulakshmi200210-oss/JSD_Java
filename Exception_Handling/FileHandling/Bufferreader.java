import java.io.*;
class Find{
   public static void main(String args[])throws Exception{
   BufferedReader br = new BufferedReader(new FileReader("StudentData/Demo.txt"));
   String line;
   while((line = br.readLine()) != null) {
   System.out.println(line);
   }
   br.close();
    }
   
    }
   
