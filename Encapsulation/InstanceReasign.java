import java.util.Scanner;
class Details{
    String name;
    static String Email;
    static String PhoneNumber;
    int age;
    void Display(){
        System.out.println("Name:"+name);
        System.out.println("Email:"+Email);
        System.out.println("PhoneNumber:"+PhoneNumber);
        System.out.println("Age:"+age);
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Details obj=new Details();
        obj.name=s.nextLine();
        obj.Email=s.nextLine();
        obj.PhoneNumber=s.nextLine();
        obj.age=s.nextInt();
       obj.Display();
    //   System.out.println(obj.name);
    }
}