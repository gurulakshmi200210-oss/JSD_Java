import java.util.Scanner;
class Letter{
    public void Check(String email){
        int num=email.indexOf("@");
        for(int i=0;i<num;i++){
            System.out.print(email.charAt(i));
        }
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your MailID:");
        String email=s.nextLine();
        Letter obj=new Letter();
        obj.Check(email);
    }
}