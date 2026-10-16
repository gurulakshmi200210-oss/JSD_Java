import java.util.Scanner;
class Letter{
    public void validate(String fname, String lname){
        if((fname.length()>=3)&&(lname.length()>=3)){
            if(fname.equals(lname)){
                System.out.println("First name and Last name are same"+fname);
            }
            else{
                System.out.println(fname.concat(lname));
            }
        }
        else{
            System.out.println("Name less 3characters.. Check your name.. is it correct?O.O");
        }
    }
   
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first name:");
        String fname=s.nextLine();
        System.out.println("Enter the last name:");
        String lname=s.nextLine();
        Letter obj=new Letter();
        obj.validate(fname,lname);
    }
}