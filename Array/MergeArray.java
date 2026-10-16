import java.util.*;
class Number{
    public void Merge(int arr[], int array[]){
        int k=0;
        int storearray3=arr.length+array.length;
        int arr3[]=new int[storearray3];
        for(int i=0;i<arr3.length;i++){
            if(i<arr.length){
                arr3[i]=arr[i];
            }
            else{
                arr3[i]=array[k];
                k++;
            }
            System.out.print(""+arr3[i]);
        }
    } 
}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the 1st array size:");
        int userinput=s.nextInt();

        int arr[]=new int[userinput];
        for(int i=0;i<userinput;i++){
            arr[i]=s.nextInt();
        }

        System.out.println("Enter the  2nd array size");
        int seconduserinput=s.nextInt();

        int array[]=new int[seconduserinput];
        for(int j=0;j<seconduserinput;j++){
            array[j]=s.nextInt();
        }
        Number obj=new Number();
        obj.Merge(arr,array);
    }
}