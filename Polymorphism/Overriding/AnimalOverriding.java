import java.util.Scanner;
class Animal{
    public  void sound(String name){
        System.out.println(name+"Animal");
    }
}
    class Dog extends Animal{
        public void sound(String name){
            super.sound(name);
            System.out.println(name+"Bark-vaowvaow");
        }
    }
    class Cat extends Animal{
        public void sound(String name){
            super.sound(name);
            System.out.println(name+"Mewo-Mewo");
        }
    }

class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter string");
        String name=s.nextLine();
        System.out.println("Enter 1-Animal, 2-Dog, 3-Cat");
        int ch=s.nextInt();
        Animal obj=new Animal();
        Dog obj1=new Dog();
        Cat obj2=new Cat();
        switch(ch){
            case 1:
                obj.sound(name);
                break;
            case 2:
                obj1.sound(name);
                break;
            case 3:
                obj2.sound(name);
                break;
        }
       
        

    } 
}