interface Addition{
    abstract int add(int a,int b);
    
}
class Find{
    public static void main(String args[]){
        Addition ad =(a,b) -> {
            int c=a+b;
            // System.out.println(c);
            return c;
        };
        int res=ad.add(1,3);
        System.out.println(res);
    }
}