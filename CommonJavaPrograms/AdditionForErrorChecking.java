import java.util.Scanner;
class Addition{
    public int add(int num1, int num2){
        int c=num1+num2;
        return c;
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
        Addition obj=new Addition();
        int output=obj.add(num1,num2);
        System.out.println(output);
    }
}