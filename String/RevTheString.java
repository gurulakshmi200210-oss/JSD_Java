import java.util.Scanner;
class Letter{
    public void Reverse(String word){
        String rev=" ";
        String temp=word;
        int index=word.length()-1;
        for(int i=index;i>=0;i--){
            rev += word.charAt(i);
        }
        
        System.out.println(rev);
        if(temp.equals(word)){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }
    }

}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the word.. you want to Reverse:");
        String word=s.nextLine();
        Letter obj=new Letter();
        obj.Reverse(word);
    }
}