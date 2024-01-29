package Encapsulation;

public class BNI extends BankLoan {

    public static void main (String[]args){
        BankLoan loan = new BankLoan();

        loan.setName("mamang gaming");
        loan.setAmount(999999999);
        loan.setAge(20);

        System.out.println("Customer name is " + loan.getName());
        System.out.println("The Age is " + loan.getAge());
        System.out.println("Amount Of Loan are " + loan.getAmount());
    }
    
    

}
