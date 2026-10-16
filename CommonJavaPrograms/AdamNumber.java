import java.util.Scanner;
class Number{
    public void adam(int num){
        // int temp=num;
        int square=num*num;
        System.out.println("square of given number:"+square);
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        System.out.println("rev"+rev);
        int Revsquare=rev*rev;
        System.out.println(""+Revsquare);
        int Rrev=0;
        while(Revsquare>0){
            int rem=Revsquare%10;
            Rrev=(Rrev*10)+rem;
            Revsquare=Revsquare/10;
        }
        System.out.println("Revnum"+Rrev);
        if(square==Rrev){
            System.out.println("AdamNumber");
        }
        else{
            System.out.println("Not AdamNumber");
        }

    }
    
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=s.nextInt();
        Number obj=new Number();
        obj.adam(num);
    }
}