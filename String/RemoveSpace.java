import java.util.Scanner;
class Letter{
    public void space(String word){
       String arr[]=word.split(" ");
       String add="";
    for(int i=0;i<arr.length;i++){
        add+=arr[i];
    }
    System.out.println(add);
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        Letter obj=new Letter();
        obj.space(word);

    }
}