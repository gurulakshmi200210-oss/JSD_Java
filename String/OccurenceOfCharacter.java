import java.util.Scanner;
class Letter{
    public void Occurence(String word,char letter){
        int count=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==(letter)){
                count++;
            }
        }
        System.out.println(count);
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the word u want");
        String word=s.nextLine();
        System.out.println("Enter the letter u want");
        char letter=s.next().charAt(0);
        Letter obj=new Letter();
        obj.Occurence(word,letter);
    }
}