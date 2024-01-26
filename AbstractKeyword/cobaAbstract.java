package AbstractKeyword;

abstract public class cobaAbstract {
   abstract public void iniMethodAbstract(); // ini methode Abstract, dia nggak punya body
   public void iniNonAbstract() {

   }

   public static void main (String[]args){
    cobaAbstract ca = new ChildAbstract();
    cobaAbstract ca1 = new ChildAbstract2();

    ca.iniMethodAbstract(); // ini karena udh extend ke ChildAbstract
    ca1.iniMethodAbstract(); //ini karena udh extend ke ChildAbstract2
   }
}
