package Encapsulation;

public class BankLoan {

    private String name;
    private int age;
    private int amount;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age>=18 && age<=50){
        this.age = age;
    }else{
        System.out.println("You are not allowed to Apply Loan");
    }
    }

    public void setAmount(int amount){
        if (amount>=1000000 && amount<=9999999) {
        this.amount = amount;
    }
    else{
        System.out.println("Your Loan are invalid");
    }
    }
   
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getAmount(){
        return amount;
    }
    
}
