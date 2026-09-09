import java.util.Scanner;
class Number{
    public void Disarium(int num){
        int sum=0;
        int temp=num;
        int alter=num;
        int count=0;
        // int next=num;
        while(num>0){
            count++;
            num=num/10;
        }
        while(alter>0){
            int rem=alter%10;
            int power=(int)Math.pow(rem,count);
            sum=sum+power;
            count--;
            alter=/10;

        }
        if(temp==sum){
            System.out.println("Disarium Number");
        }
        else{
            System.out.println("Not Disarium Number");
        }
    }

}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        Number obj=new Number();
        obj.Disarium(num);

    }

}