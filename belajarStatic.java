public class belajarStatic {
int angka12 = 0;
static int angka13 = 0;

public belajarStatic(){
angka12++;
angka13++;

System.out.println("ini angka " + angka12 );
System.out.println("ini angka " + angka13 );

}
    public static void main (String[]args){
        belajarStatic belajar2 = new belajarStatic();
        belajarStatic belajar3 = new belajarStatic();
        belajarStatic belajar4 = new belajarStatic();
        
    }
    
}
