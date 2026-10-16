import java.util.Scanner;
class Number{
    public void Reverse(int num){
        int temp=num;
        int rem=0;
        int rev=0;
        while(num>0){
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("The given Number is Palindrome");
        }
        else{
            System.out.println("The given Number is Not Palindrome");
            }
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number you want to check wheather it is a Palindrome or not");
        int num=s.nextInt();
        Number obj=new Number();
        obj.Reverse(num);
    }
}