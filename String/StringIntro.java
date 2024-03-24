package String;

public class StringIntro {
    
    public static void main(String[] args) {
        String mamang =  "larasa";
        String mamang1 = "larasa"; // kalo ini masuk ke dalam string pool di java
        String marsha = new String("cakep") ; 
        String marsha1 = new String("cakep") ; // ini masuk ke JVM sebagai 2 stack yang berbeda

        System.out.println(mamang);
        System.out.println(mamang1);
        System.out.println(marsha);
        System.out.println(marsha1);

    }
}
