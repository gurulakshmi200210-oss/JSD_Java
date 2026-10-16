import java.util.Scanner;
class Letter{
    public void Rearrange(String Sentence){
        String arr[]=Sentence.split(" ");
        String add="";
        int index=(arr.length)-1;
        for(int i=index;i>=0;i--){
        add+=arr[i]+" ";
        }
        System.out.println(add);
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String Sentence=s.nextLine();
        Letter obj=new Letter();
        obj.Rearrange(Sentence);
    }
}