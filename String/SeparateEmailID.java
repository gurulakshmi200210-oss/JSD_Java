import java.util.Scanner;
class Email{
    public void MyID(String mail){
        int count=0;
        int Flag=0;
        int special=0;
        int Vowelcount=0;
        int Consonantcount=0;
        String email=mail.toLowerCase();
        for(int i=0;i<email.length();i++){
            char letter=email.charAt(i);
            if(letter>= 'a' && letter<='z'){
                count++;
                if(letter =='a' ||letter =='e' ||letter =='i' || letter =='o' ||letter =='u' ){
                    Vowelcount++;
                }
                else{
                    Consonantcount++;
                }
            }
            else if(letter >='0' && letter <= '9'){
                Flag++;
            }
            else{
                special++;
            }
        }
        System.out.println("LetterCount:"+count);
        System.out.println("VowelCount:"+Vowelcount);
        System.out.println("Consonantcount:"+Consonantcount);
        System.out.println("NumberCount:"+Flag);
        System.out.println("SpecialSymbolCount:"+special);


    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your email id:");
        String email=s.nextLine();
        Email obj=new Email();
        obj.MyID(email);


    }
}