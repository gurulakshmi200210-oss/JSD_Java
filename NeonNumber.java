import java.util.Scanner;
class Number{
    public void Neon(int num){

        int temp =num;

        int sum=0;

        int square= num * num;

        while(square>0){

            int rem=square%10;
            sum+=rem;
            square=square/10;
        }
        
        if(temp==sum){
            System.out.println("NeonNumber");
        }
        else{
            System.out.println("Not Neon number");
        }


    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        Number obj=new Number();
        obj.Neon(num);
    }
}