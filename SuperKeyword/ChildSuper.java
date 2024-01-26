package SuperKeyword;

public class ChildSuper extends CobaSuper {
    String Supera = "ini yang child nya";

    ChildSuper(){
        super(); //tanpa super juga udh mewarisi constructor dari parent, diapus juga nggak papa
        System.out.println("ini Constructor Child");
    }
    public void Superman(){
        System.out.println(super.Supera);
        System.out.println(Supera);
    }
    public static void main (String[]args){
        ChildSuper cs = new ChildSuper();
        cs.Superman();
    }
}
