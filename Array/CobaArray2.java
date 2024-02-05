package Array;

public class CobaArray2 {
    
    public static void Arrayaja(int arrayOne[]) {
       int min = arrayOne[0];

       for (int i = 1; i< arrayOne.length; i++){
        if(min>arrayOne[i]){
            min = arrayOne[i];
            
        }
       }
       System.out.println("Jumlah yang paling minimum adalah " + min);
    }

    public static int [] ArrayinAja(){
        return new int[] {10,20,30,40,50};
    }

    public static void main(String[] args) {
        CobaArray2 cobainAr = new CobaArray2();
         int arrayTest[]={10,27,39,40,20,79};
        cobainAr.Arrayaja(arrayTest);
        int Arraydua [] = cobainAr.ArrayinAja();
        System.out.println(Arraydua[2]);
    }
}
