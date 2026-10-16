import java.util.Scanner;
class InvaildAgeException extends  Exception{
    public InvaildAgeException(String age){
        super(age);
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=s.nextInt();

        try{
          if(age >=18){
            System.out.println("you are Eligible for Vote");
          }
          else{
            throw new InvaildAgeException("you are child now");
           }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
