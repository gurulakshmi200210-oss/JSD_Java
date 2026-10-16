class Pattern{
    public void Ipattern(){
        int a=65;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print((char) a);
              //  System.out.print("j"+j);
            }
            
            System.out.println("");
            a++;
        }
    }
}
class Find{
    public static void main(String args[]){
        Pattern obj=new Pattern();
        obj.Ipattern();
    }
}