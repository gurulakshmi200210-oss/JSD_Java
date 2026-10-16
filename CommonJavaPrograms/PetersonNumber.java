import java.util.Scanner;
class Number{
    public void Peterson(int num){
        int sum=0;
        int temp=num;
        while(num>0){
            int rem=num%10;
            int fact=1;
            System.out.println("num"+num);
            System.out.println("rem"+rem);

        for(int i=1;i<=rem;i++){
            fact*=i;
        }
        System.out.println("fact"+fact);
        num=num/10;
        sum+=fact;
        }
        System.out.println("sum"+sum);
        if(temp==sum){
            System.out.println("PetersonNumber");
        }
        else{
            System.out.println("Not PetersonNumber");
        }
    } 

}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        Number obj=new Number();
        obj.Peterson(num);
    }

}
 