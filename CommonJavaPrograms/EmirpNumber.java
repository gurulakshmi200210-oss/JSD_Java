import java.util.Scanner;
class Number{
    public void Emirp(int num){
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
            if(count ==0){
                int rev=0;
                while(num>0){
                    int rem=num%10;
                   rev=(rev*10)+rem;
                    num=num/10;
                    
                }
                int flag=0;
                for(int j=2;j<rev;j++){
                    if(rev%j==0){
                        flag++;
                    }
                }
                System.out.println("Flag"+flag);
                if(flag==0){
                    System.out.println("The Number Emirp Number ");
                }
                else{
                    System.out.println("The Number is not Emirp Number");
                }
                
            }
            else{
                System.out.println("Its not prime & Emrip Number");
            }
        

    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        Number obj=new Number();
        obj.Emirp(num);
    }
}