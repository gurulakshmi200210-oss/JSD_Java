import java.util.Scanner;
class Number{
    public int sumlogic(int num){
        int sum = 0;
        while (num > 0) {
        int rem = num % 10;
        sum+=rem;
        num = num / 10;
        }
        return sum;


    }
    public int productlogic(int num){
        int product=1;
        while (num > 0) {
        int rem = num % 10;
        product*=rem;
        num = num / 10;
        
    }
       return product;
    }
    public void spy(int num,int sum, int product){
        int temp=num;
        int logical=sum+product;
        if(temp == logical){
            System.out.println("Spy");
        }
        else{
            System.out.println("not spy");
        }
        

    }
}
class find{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);

        int num=obj.nextInt();
       

        Number value=new Number();

        int x=value.sumlogic(num);
       

        int y=value.productlogic(num);
        

        value.spy(num,x,y);
        

    }
}
        