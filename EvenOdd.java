import java.util.Scanner;
class Number{
    public int digits(int num){
        if(num%2==0){
            System.out.println("EvenNumber");
        }
        else{
            System.out.println("OddNumber");
        }
        return num;
    }
}
class find{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        Number obj=new Number();
        obj.digits(num);
    }
}