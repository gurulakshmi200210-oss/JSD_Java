import java.util.Scanner;
class ThreeOption{
    public void Alphabet(String name){

        int count=0;
        int vcount=0;
        int ccount=0;

        for(int i=0;i<name.length();i++){

            char letter=name.charAt(i);

            if(letter == 'a' && letter == 'z'){
                count++;

                if(letter=='a'|| letter=='e'||letter=='i'||letter=='o'||letter=='u'){
                    vcount++;
                }
                else{
                    ccount++;
                }
            }
        }
        System.out.println("AlphabetCount is:"+count);
        System.out.println("VewolCount is:"+vcount);
        System.out.println("ConsonantCount is:"+ccount);
    }

    public void Number(String name){
        int ncount=0;
        for(int i=0;i<name.length();i++){
            char letter=name.charAt(i);
            if(letter=='0'&& letter=='9'){
                ncount++;
            }
            else{
                System.out.println("There is no number in the given input");
            }
        }
        System.out.println("NumberCount is:"+ncount);
    }
    public void SpecialCharacter(String name){
        int scount=0;
        for(int i=0;i<name.length();i++){
            char letter=name.charAt(i);
            if(letter =='@'||letter=='#'||letter=='!'|| letter=='$'||letter=='%'||letter=='^'||letter=='&'||letter=='*'||letter=='('||letter==')'||letter=='_'||letter=='-'||letter=='+'||letter=='='||letter=='|'||letter=='~'||letter==':'||letter=='`'){
                scount++;
            }
        }
        System.out.println("Special Characters count is:"+scount);
    }

}
class Find{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Name:");
        String name=s.nextLine();
        ThreeOption obj=new ThreeOption();
        System.out.println("Enter your Choice \n 1.Alphabet \n 2.Number \n 3.SpecialCharacter");
        int ch=s.nextInt();
        switch(ch){
            case 1:
                obj.Alphabet(name);
                break;

            case 2:
                obj.Number(name);
                break;

            case 3:
                obj.SpecialCharacter(name);
                break;

            default :
            System.out.println("May be check your option!! Its Invaild");
        }
    }
}