import java.util.Scanner;
class Number{
    int num;
    int count;
    public Number(int num){
        this.num=num;
        count=0;
    }
    public void Prime(){
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }

}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        Number obj=new Number(num);
        obj.Prime();
    }
}