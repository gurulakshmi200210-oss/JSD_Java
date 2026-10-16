import java.util.Scanner;
class Number{
    int num;
    int sum;
    int product;
    int rem;
    public Number(int num){
        this.num=num;
        sum=0;
        product=1;
       
    }
    public int sumlogic(){
        while (num > 0) {
        rem = num % 10;
        sum+=rem;
        num = num / 10;
        }
        return sum;
        


    }
    System.out.println("Sum:"+sum);
    public int productlogic(){
        while (num > 0) {
        rem = num % 10;
        product*=rem;
        num = num / 10;
        
    }
       return product;
      
    }
     System.out.println("Product:"+product);
    public void spy(int sum, int product){
        if(sum==product){
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
        System.out.println("Enter the Spy");

        int num=obj.nextInt();
       

        Number value=new Number(num);

        int x=value.sumlogic();
       

        int y=value.productlogic();
        

        value.spy(x,y);
        

    }
}
        