import java.util.Scanner;
abstract class ATM{
    abstract void loan( double percentage,int Amount );
    Scanner value =new Scanner(System.in);
    final void rules(int ch,int intialAmount){
        switch(ch){
        case 1:
            System.out.println("The current Amount in your account is:"+intialAmount);
            break;
        case 2:
            System.out.println("Enter the Amount you want to WITHDRAW ");
            int AddWithdraw=value.nextInt( );
                if(AddWithdraw < intialAmount){
                   int WithdrawAmt=intialAmount-AddWithdraw;
                   System.out.println("WithdrawAmount is:"+WithdrawAmt);
                }
                else{
                    System.out.println("Invaild Withdraw Amount");
                }
                break;
        case 3:
            System.out.println("Enter the Amount you want to Deposite");
                 int AddDeposite=value.nextInt( );
                if(AddDeposite>0){
                   int FDeposite=intialAmount+AddDeposite;
                   System.out.println("Deposite Amount is:"+FDeposite);
                }
                else{
                   System.out.println("Invaild Deposite Amount");
                }
                break;
        default :
            System.out.println("Invaild call");
    }
    }
}
class SBIATM extends ATM{
    public void loan(double percentage, int Amount){
        if(percentage>75){
            int Interest=Amount*(5/100);
            int simpleInterest=Amount*Interest*3;
            System.out.println("Amount with interest"+simpleInterest);
        }
        else{
            System.out.println("You are noteligible");
        }
    }

}
class Find{
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int intialAmount=5000;
    System.out.println("Enter your choice \n Enter 1 for Saving based services \n Enter 2 for loan based service");
    int choice=s.nextInt();
    switch(choice){
        case 1:
            System.out.println("1.checkBalance \n 2.Withdraw \n 3.Deposite");
            int ch=s.nextInt();
            obj.rules();
            break;
        case 2:
            System.out.println("Welcome to Loan Session---EducationLoan");
            obj.loan();
            break;
        default :
        System.out.println("Invaild option");

    }
    SBIATM obj=new SBIATM();
    
}
}