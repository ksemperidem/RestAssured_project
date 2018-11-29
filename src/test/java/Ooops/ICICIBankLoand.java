package Ooops;

public class ICICIBankLoand extends BankLoan {

    public static void main(String[] args){
        BankLoan bl = new BankLoan();

        bl.setName("test");
        bl.setAge(32);
        bl.setAmount(4445);

        System.out.println(bl.getAge());
        System.out.println(bl.getName());
        System.out.println(bl.getAmount());
    }
}
