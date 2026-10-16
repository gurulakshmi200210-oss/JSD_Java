import java.util.Scanner;
class Circle{
    public double area(double pi, int r){
    
        double areaCircle=(pi*r*r);
        return areaCircle;

    }
}
class Area{
    public static  void main(String args[]){
         double pi=3.14;
        Scanner s=new Scanner(System.in);
        System.out.println("pi value"+pi);
        int r=s.nextInt();
        System.out.println("r value"+r);
        Circle value=new Circle();
        double Areaa=value.area(pi,r);
        System.out.println("Area of Circle is:"+Areaa);

    }
}