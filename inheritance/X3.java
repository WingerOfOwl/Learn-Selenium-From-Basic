package inheritance;



public class X3 extends BMW{
    String model = "X3";
    public static void main (String[]args){
        BMW bmw = new BMW();
        X3 x = new X3();
        System.out.println(x.model);
        System.out.println(bmw.harga);
        bmw.carma();
    }
}
