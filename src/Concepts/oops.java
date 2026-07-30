package Concepts;

public class oops {
    public static void main(String[] args) {
        pen p = new pen();
        p.setcolor("blue");
        System.out.println(p.color);
        p.setTip(5);
        System.out.println(p.tip);
        p.tip=4;
        System.out.println(p.tip);
        Bankaccount myacc = new Bankaccount();
        myacc.Username = "yash";
        myacc.setpassword("gdftyhyf");
    }

}
class Bankaccount{
    public String Username;
    private String passw;
     void setpassword(String pass){
        passw = pass;
    }


}



class pen{
    String color;
    protected int tip;
    void setcolor(String newcolor){
        color = newcolor;
    }

    void setTip(int newtip){
        tip = newtip;
    }
}

class student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy,int chem, int maths){
        percentage= (phy + chem + maths) /3;
    }
}