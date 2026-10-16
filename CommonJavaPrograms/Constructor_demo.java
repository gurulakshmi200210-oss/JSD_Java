import java.util.Scanner;
class Constructor{
    public Constructor(){
       System.out.println("This one is Constructor");
    }
    public void greating(String name){
        System.out.println("Welcome "+name);
    }

}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        Constructor obj=new Constructor();
        obj.greating(name);
     
    }
}
