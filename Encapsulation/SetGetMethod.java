class Details{
    private String name;
    private String mail;

    public void setName(String name){
        if(name.length() >3){
            this.name=name;
        }
    }

    public void setMail(String mail){
       
        this.mail=mail;
      
    }

    public String getName(){
        return name;
    }

    public String getMail(){
        return mail;
    }

    public void display(){
        System.out.println(name);
        System.out.println(mail);
    }
}
class Find{
    public static void main(String args[]){
        Details obj=new Details();
        obj.setName("Muthu");
        obj.setMail("MuthulakshmiMuthputhiyavan@gmail.com");
        System.out.println(obj.getName());
        System.out.println(obj.getMail());
    }
}