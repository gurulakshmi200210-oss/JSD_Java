import java.util.*;
class Number{
    public void target(int arr,int targetvalue){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(targetvalue==(arr[i]+arr[j])){
                    System.out.println()
                }
            }
            
        }
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("SizeOfArray");
        int userinput=s.nextInt();
        int arr[]=new int [userinput];
        for(int i=0;i<userinput;i++){
            System.out.println("Enter the value store");
            arr[i]=s.nextInt();
        }
        System.out.println("TargetValue");
        int targetvalue=s.nextInt();
    }
}