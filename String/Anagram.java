import java.util.*;
class Letter{
    public void Anagram(String word1, String word2){
        int count=0;
        for(int i=0;i<word1.length()-1;i++){
            for(int j=0;j<word2.length()-1;i++){
                if(word1.charAt(i)!=word2.charAt(j)){
                    count++;
                    break;
                    // System.out.println("Anagram");
                }
            }
            if(count ==word1.length()){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        }
    }

}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Word:");
        String word1=s.nextLine();
        System.out.println("Enter the second word:");
        String word2=s.nextLine();
        Letter obj=new Letter();
        obj.Anagram(word1,word2);
    }
}



// if(word1!= word2){

// }
// else{
//     char a[]=new char(word1.length())
// }