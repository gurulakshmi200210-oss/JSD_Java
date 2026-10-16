import java.util.Scanner;
class Word{
    public void Msg(String name ,int num){
      System.out.print(name.repeat(num));
    }
   
}
class find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        int num=s.nextInt();
        Word obj=new Word();
        obj.Msg(name,num);
       
    }
}