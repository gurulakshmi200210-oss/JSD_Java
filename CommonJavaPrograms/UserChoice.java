import java.util.Scanner;
class Calculate{
    public int add(int a, int b){
        int c=a+b;
        return c;
    }
    public int sub(int a, int b){
        int c=a-b;
        return c;
    }
    public int mul(int a, int b){
        int c=a*b;
        return c;
    }
    public int div(int a, int b){
        int c=a/b;
        return c;
    }
}
class UserChoice{
    public static void main(String args[]){
        Scanner value=new Scanner(System.in);
        System.out.println("Enter the value of a & b");
        int a=value.nextInt();
        int b=value.nextInt();
        System.out.println("Enter the choice: 1, 2, 3, 4");
        int choice=value.nextInt();
        Calculate obj=new Calculate();
        switch(choice){
            case 1:{
            int Addition=obj.add(a,b); 
            System.out.println("Addition:"+Addition);
            break;
            }

            case 2:{
            int Subtraction= obj.sub(a,b);
            System.out.println("subtraction:"+Subtraction);
            break;
            }

            case 3:{
            int Multiple=obj.mul(a,b);
            System.out.println("Multiple:"+Multiple);
            break;
            }

            case 4:{
            int Divide=obj.div(a,b);
            System.out.println("Divide:"+Divide);
            break;
            }

            default :{
                System.out.println("Invaild choice");
            }

        }
       
       
       

       
    }
}


