import java.util.*;
class Find{
    public int minfinder(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public int maxfinder(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    public int finder(int arr[]){
        int b=10;
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(b==arr[i]){
                c=i;
            }
        }
        return c;
    }
}
class BasicArray{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the sizeof array:");
        int userinput=s.nextInt(); 
        int arr[]=new int[userinput];
        Find obj=new Find();
        for(int i=0;i<userinput;i++){
            System.out.println("Enter the value stored in array");
            arr[i]=s.nextInt();
            System.out.println( arr[i]+" ");
            
        }
        int x=obj.finder(arr);
        System.out.println("Finder"+x);
        int y=obj.maxfinder(arr);
        System.out.println("Maxium Value"+y);
        int z=obj.minfinder(arr);
        System.out.println("minimum"+z);
    }
    
}