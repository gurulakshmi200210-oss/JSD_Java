// import java.util.Scanner;
class Student{
    int id;
    String name;
    static int count;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
        count++;
        System.out.println(count);
    }
    // System.out.println(count);
}
class Find{
    public static void main(String args[]){
        for(int i=0;i<=10;i++){
        Student obj= new Student(1,"muthu");
        }
        
        
    }
}