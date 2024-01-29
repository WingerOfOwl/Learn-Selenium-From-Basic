package Interface;

public class Administration implements Student {

    
    public void name() {
        System.out.println("Greesela Sophina Adhalia Lutuna");
    }

   
    public void ID() {
        System.out.println("01839470");
    }

 
    public void Kelas() {
       System.out.println("Administration 1 B");
    }
    
    public void GetMayor(){
        System.out.println("This is Administration Class From " + Student.Universitas);
    }

    public static void main (String[]args){
        Engineer eng = new Engineer();
        Administration adm = new Administration();

        eng.name();
        eng.ID();
        eng.Kelas();
        eng.GetMayor();
        eng.Wilayah();

        System.out.println("--------------------------");

        adm.name();
        adm.ID();
        adm.Kelas();
        adm.GetMayor();
        adm.Wilayah();

    }


    
    public void Wilayah() {
        System.out.println("PSDKU Demak");
    }
}
