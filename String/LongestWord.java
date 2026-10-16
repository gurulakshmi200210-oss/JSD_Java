import java.util.Scanner;
class Letter{

    public void Longest(String Sentence){
        String arr[]=Sentence.split(" ");
        String longest=arr[0];
    
        for(int i=0;i<arr.length;i++){
            if(arr[i].length() >longest.length()){
            longest = arr[i];
    
            }
          
        }
          System.out.println(longest);
        

    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String Sentence=s.nextLine();

        Letter obj=new Letter();
       
        obj.Longest(Sentence);
    }
}