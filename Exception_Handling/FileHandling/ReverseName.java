import java.io.*;
class Find{
    public static void main(String args[])throws Exception{
    //    FileReader fr=new FileReader("StudentData/Name.txt");
       BufferedReader br=new BufferedReader(new FileReader("StudentData/Name.txt"));
       String ch;
       String reverse="";
       while((ch=br.readLine())!=null){
    
        for(int i=ch.length()-1;i>=0;i--){
            reverse=reverse+ch.charAt(i);
        }
        // System.out.println(name);
        System.out.println(reverse);
       }
    }
}