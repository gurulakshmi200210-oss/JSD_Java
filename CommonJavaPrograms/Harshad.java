import java.util.Scanner;
class Number{
    public void Harshad(int num){
        int sum=0;
        int temp=num;
        while(num>0){
            int rem=num%10;
            sum +=rem;
            num=num/10;
        }
        System.out.println(sum);
        int answer=(temp%sum);
        System.out.println(answer);
        if(answer == 0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not Harshad Number");
        }


    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        Number obj=new Number();
        obj.Harshad(num);

    }
}