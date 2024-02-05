package Array;

public class CobaArray {
    
    public static void main(String[] args) {
        int arraycoba[] = new int[6];
        arraycoba[0]=12;
        arraycoba[1]=13;
        arraycoba[2]=14;
        arraycoba[3]=15;
        arraycoba[4]=16;
        arraycoba[5]=17;
        System.out.println(arraycoba[0]);

        for(int i = 0; i < arraycoba.length; i++){
            System.out.println(arraycoba[i]); // ini buat looping array dan sesuai dengan index
            System.out.println(i); // kalo kayak gini malah nantinya dia nge print 5 index dan index 0 nggak diitung
        }

        int arraylagi[] ={10,20,30,40,50};
        System.out.println(arraylagi.length); // ini buat ngeliat ada berapa size dari array
        System.out.println(arraylagi[0]); // ini buat nge print array sesuai index dan disini index ke 0
        
    }
}
