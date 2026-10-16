import java.util.Scanner;
class word{
    public String letter(String name){
        String Fullname= "Welcome"+name;
        return Fullname;
    }
}
class find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        word obj=new word();
        String Fname=obj.letter(name); 
        System.out.println(Fname);

    }
}