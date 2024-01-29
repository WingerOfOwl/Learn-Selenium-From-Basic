package Interface;

public class Engineer implements Student{

    
    public void name() {
      System.out.println("Marsha Lenathea Lapian");
    }

  
    public void ID() {
        System.out.println("1208038");
    }

    
    public void Kelas() {
        System.out.println("Engineer 1 A");
    }

    public void GetMayor(){
        System.out.println("This is Engineering Class From " + Student.Universitas);
    }


    public void Wilayah() {
        System.out.println("Depok");
    }
    
}
