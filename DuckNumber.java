import java.util.Scanner;
class Number{
    public int Duck(int num){
        int count=0;
        while(num>0){
            int rem=num%10;
           
            if(rem==0){
                count++;
            }
            num=num/10;

        }
        return count;


    }
    public void FindDuckOrNot(int count){
        if(count>0){
           System.out.println("Its Duck");
        }
        else{
            System.out.println("Not Duck");
        }
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        Number obj=new Number();
        int TheVarGetCountVal=obj.Duck(num);
        obj.FindDuckOrNot(TheVarGetCountVal);

    }
}