import java.util.Scanner;
interface ATM{
    abstract void payment(int Amt,int num);
    static void cash(int Amt) {
      System.out.println("The payment "+Amt+" go through Cash\n ThankYou..\nVisit Again--^_^");
    }
}

class credit implements ATM{
    public void payment(int Amt,int num){
        if(num == 12345){
            System.out.println("PASSWORD CORRECT");
        }
        else{
            System.out.println("PASSWORD INCORRECT");
        }
    System.out.println("The payment "+Amt+" go through credit card\n ThankYou..\nVisit Again--^_^");
    }
}
class debt implements ATM{
    public void payment(int Amt,int num){
        if(num == 1234){
            System.out.println("PASSWORD CORRECT");
        }
        else{
            System.out.println("PASSWORD INCORRECT");
        }
     System.out.println("The payment "+Amt+" go through debited card\n ThankYou..\nVisit Again--^_^");
    }
}

class upi implements ATM{
    public void payment(int Amt,int num){
        if(num == 2411){
            System.out.println("PASSWORD CORRECT");
        }
        else{
            System.out.println("PASSWORD INCORRECT");
        }
       System.out.println("The payment "+Amt+" go through UPI\n ThankYou..\nVisit Again--^_^");
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        credit obj1=new credit();
        debt obj2=new debt();
        cash obj3=new cash();
        upi obj4=new upi();
        System.out.println("Enter your choice of Payment:\n 1.CREDIT CARD \n 2.DEBIT CARD \n 3.CASH \n 4.UPI");
        int ch=s.nextInt();
        System.out.println("Enter your Amount");
        int Amt=s.nextInt();

        switch(ch){
            case 1:
                System.out.println("Enter the CREDIT CARD NUMBER ");
                int creditCardNo=s.nextInt();
                System.out.println("Enter the Password of your CREDIT CARD NUMBER ");
                int creditCardPassword=s.nextInt();

                obj1.payment(Amt,creditCardPassword);
                break;
            case 2:
                System.out.println("Enter the DEBIT CARD NUMBER ");
                int debitCardNo=s.nextInt();
                System.out.println("Enter the Password of your DEBIT CARD NUMBER ");
                int debitCardNoPassword=s.nextInt();
                obj2.payment(Amt,debitCardNoPassword);
                break;
            case 3:
                obj3.payment(Amt);
                break;
            case 4:
                System.out.println("Enter the UPI NUMBER ");
                int UPiNo=s.nextInt();
                System.out.println("Enter the Password of your UPI NUMBER ");
                int UPiPassword=s.nextInt();
                obj4.payment(Amt,UPiPassword);
                break;
            default :
            System.out.println("Invaild Option");
        }

    }
}