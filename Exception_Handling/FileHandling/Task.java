import java.io.*;
class zero{
    public static void main(String args[]) throws Exception{
        FileReader f=new FileReader("StudentData/Demo.txt");
        BufferedReader br=new BufferedReader(f);
        int count=0;
        int chars=0;
        String line;
        while((line=br.readLine())!=null){
             count++;
            chars+=line.length();
          
            
        }
        System.out.println("Lines"+count);
        System.out.println("count"+chars);
       
        br.close();
    }
}