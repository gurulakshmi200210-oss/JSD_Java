import java.util.Scanner;
abstract class ATM{
    abstract void checkbal(int intialAmount);
    abstract void Withdraw(int intialAmount,int AddWithdraw);
    abstract void Deposite(int intialAmount, int AddDeposite);
}
class SBIATM extends ATM{
    public void checkbal(int intialAmount){
        System.out.println("The current Amount in your account is:"+intialAmount);

    }
    public void Withdraw(int intialAmount,int AddWithdraw){
        // int WithdrawAmt=intialAmount-AddWithdraw;
        // System.out.println("Withdraw Amount is:"+WithdrawAmt);
        if(AddWithdraw < intialAmount){
        int WithdrawAmt=intialAmount-AddWithdraw;
        System.out.println("WithdrawAmount is:"+WithdrawAmt);
        }
        else{
            System.out.println("Invaild Withdraw Amount");
        }
    }
    public void Deposite(int intialAmount, int AddDeposite){
        if(AddDeposite>0){
        int FDeposite=intialAmount+AddDeposite;
        System.out.println("Deposite Amount is:"+FDeposite);
        }
        else{
            System.out.println("Invaild Deposite Amount");
        }
    }
    

}
class Fun{
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int intialAmount=5000;
    System.out.println("Enter your choice");
    System.out.println("1.checkBalance \n 2.Withdraw \n 3.Deposite");
    int ch=s.nextInt();
    SBIATM obj=new SBIATM();
    switch(ch){
        case 1:
            System.out.println("Initial Balance");
            obj.checkbal(intialAmount);
            break;
        case 2:
            System.out.println("Enter the Amount you want to WITHDRAW ");
            int AddWithdraw=s.nextInt( );
            obj.Withdraw(intialAmount, AddWithdraw);
            break;
        case 3:
            System.out.println("Enter the Amount you want to Deposite");
            int AddDeposite=s.nextInt( );
            obj.Deposite(intialAmount, AddDeposite);
            break;
        default :
            System.out.println("Invaild call");
    }
}
}