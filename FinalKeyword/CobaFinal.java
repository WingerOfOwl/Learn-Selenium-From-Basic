package FinalKeyword;

public class CobaFinal {
     final String Namagua = "Jiddan";
     String CobainTanpaFinal = "Ini tanpa final YGY"; // ini jadi nggak kepake karena udh di declare CobainTanpaFinal Function yang baru di cobanama
     String mamang;

     public final void iniFinal(){
        System.out.println("ini harusnya nggak bisa di over ride di ChildFinal Class");
     }

    public void cobanama(){
        // Namagua = "jajang"; ini karena dia pake final, jadi untuk value nya nggak bisa diubah lagi
        String mamang = "cobain";
        System.out.println(mamang);
        CobainTanpaFinal = "juju";
        System.out.println(CobainTanpaFinal);
    }

    public static void main (String[]args){
        CobaFinal cf = new CobaFinal();
        cf.cobanama();
        System.out.println(cf.Namagua);
        System.out.println(cf.CobainTanpaFinal);
    }
}
