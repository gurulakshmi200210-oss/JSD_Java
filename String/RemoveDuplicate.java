import java.util.Scanner;
class Letter{
    public void Duplicate(String word){ 
        String result = "";

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (result.indexOf(ch) == -1) {
                result = result + ch;
            } else {
                result = result + " ";
            }
        }
        System.out.println(result);
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the word u want");
        String word=s.nextLine();
        Letter obj=new Letter();
        obj.Duplicate(word);
    }
}