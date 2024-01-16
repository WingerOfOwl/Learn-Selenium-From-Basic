import javax.sound.midi.Soundbank;

public class belajar1 {
   static String oshi2 = "Greesel";
   static int angka1 = 10000;
   static int angka2 =  20;

   public static void main (String[]args) {
    belajar1.cobaprint();
    System.out.println(oshi2);
    belajar1.cobaaja();
    String oshi3 = "Ella";
    belajar1 belajardong = new belajar1();
    System.out.println(belajardong.oshi2);
    belajardong.oshicantik();
    
    belajar1 oshis1 = new belajar1(1, "marsha");
    belajar1 oshis2 = new belajar1(2, "Greesel");
    belajar1 oshis3 = new belajar1(3, "Ella");
    oshis1.cobadisplay();
    oshis2.cobadisplay();
    oshis3.cobadisplay();
    
    


//learn If Else Condition
    if (oshi3=="Greesel"){
System.out.println("oshi ku yang kedua adalah " + oshi2);
    }
    else if(oshi3=="Ella"){
System.out.println("oshiku yang ketiga " + oshi3);
    }
    else{
        System.out.println("Kamu Bukan Lah OshiKu");
    }

    if (angka1<1000){
        System.out.println("salah");
    }

    else{
        System.err.println("benar");
    }
//learn swirch case
switch (angka1) {
    case 1000:
        System.out.println("yes you're correct");
        break;
    case 2000:
    System.out.println("no you are wrong");
    default:
    System.out.println("why you're input so dumb");
        break;
}

//learn Looping
for (int Looping=0; Looping<=10; Looping++ ){
    System.out.println(Looping);
}
while (angka2>=10) {
    System.out.println(angka2);
    angka2--;
}

String mantap = "ini default";

do{
   System.out.println(mantap);

}while(mantap=="mantap");


}

// a Little Bit Learn OOP
public void oshicantik(){
    System.out.println("my oshi it's sooo beautiful her name is " + oshi2);
}

//Learn Constructor
public belajar1(){
    System.out.println("Hai Ini Constructor");
}
int rollnumber;
String MineOshi;
public belajar1(int rollnumber, String MineOshi){
this.MineOshi =  MineOshi;
this.rollnumber = rollnumber;
}

public void cobadisplay(){
System.out.println("nambah = " + rollnumber + " oshiku namanya = " + MineOshi);

}
    public static void cobaprint(){
        String angka = "1234";
        String oshi = "marsha";

        System.out.println(angka);
        System.out.println(oshi);

    }

    public static void cobaaja(){
        int a = 12345;
        int b = 4567;
        System.out.println(a + b);

        String c = "amel";
        String d = "ryan";
        System.out.println(c +" "+ d);

        System.out.println(a+b+c+d);
        System.out.println(c+d+a+b);

    }
    


}
