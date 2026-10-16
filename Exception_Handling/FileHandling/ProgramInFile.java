import java.io.*;
class File_read{
    public static void main(String args[]) throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("StudentData/Demo.txt"));
        int count=0;
        int words=0;
        int chars=0;
        String line;
        while((line=br.readLine())!=null){
            count++;
            chars+=line.length();
            words+=line.split("\\s+").length;
        }
        System.out.println("Lines"+count);
        System.out.println("Word"+words);
        System.out.println("Characters"+chars);
        br.close();
    }
}