import java.util.Scanner;
class Number{

    public int Reverse(int num){
        int temp=num;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;

        
    }

    public void palindrome(int temp, int rev){
        
        if ( temp == rev) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
        
    }
    }
class find{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);

        int num=obj.nextInt();
       int temp = num;

        Number value=new Number();

       int store = value.Reverse(num);
       

        value.palindrome(temp,store);

    }
}
        










       