import java.util.*;
class Number{
    public void Swap(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(" "+arr[i]);
        }
    }
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the array size:");
        int userinput=s.nextInt();

        int arr[]=new int[userinput];
        for(int i=0;i<userinput;i++){
            arr[i]=s.nextInt();
        }
        Number obj=new Number();
        obj.Swap(arr);
    }
}