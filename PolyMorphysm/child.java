package PolyMorphysm;

public class child extends cobaPoly {
//learn OverLoading On PolyMorphism
public static void main (String[]args){
    cobaPoly coba = new cobaPoly();
    coba.addPoly(1, 10);
    coba.addPoly(1, 2, 3);
    double d = coba.addPoly(10.1, 10.2);
    System.out.println(d);


}
    
}
