import java.util.Scanner;
class Name{
    public String letter(String Firstname, String Lastname){
        String Fullname= Firstname+Lastname;
        return Fullname;
    }
}
class find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String Firstname=s.nextLine();
        String Lastname=s.nextLine();
        Name obj=new Name();
        String Fname=obj.letter(Firstname, Lastname);
        System.out.println(Fname);

    }
}