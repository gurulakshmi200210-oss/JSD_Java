import java.util.Scanner;
class Calculation{
    private int num1;
    private int num2;

    public void setNum1(int num1){
        if(num1>=0){
            this.num1=num1;
        }
    }

    public void setNum2(int num2){
       
        if(num2>=0){
            this.num2=num2;
        }
      
    }

    public int getNum1(){
        return num1;
    }

    public int getNum2(){
        return num2;
    }
}
class Addition{
    public void add(int num1, int num2){
        int output=num1+num2;
        System.out.println(output);
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1=s.nextInt();
        System.out.println("Enter the num2");
        int num2=s.nextInt();
        Calculation obj=new Calculation();
        obj.setNum1(num1);
        obj.setNum2(num2);
        int op1=obj.getNum1();
        int op2=obj.getNum2();
        Addition objj=new Addition();
        objj.add(op1,op2);
        // Details obj=new Details();
        // obj.setName("Muthu");
        // obj.setMail("MuthulakshmiMuthputhiyavan@gmail.com");
        // System.out.println(obj.getName());
        // System.out.println(obj.getMail());
    }
}