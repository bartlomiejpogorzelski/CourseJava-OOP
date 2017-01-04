package coursejava.oop;

//Packages
public class CourseJavaOOP {

    public static void main(String[] args) {
     /*
        Encapsulation - packing properties that way,
                        so there is no direct access to them
                        from other classes
        */
     BankAccount bank = new BankAccount();
    
        System.out.println(bank.getBalance());
        bank.withdraw(10000);
        System.out.println(bank.getBalance());
    }
}
class BankAccount
{
    private int balance;
    
    BankAccount()
    {
        balance=1000;
    }
    
    int getBalance()
    {
        return balance;
    }
    
    void setBalance(int amount)
    {
      balance=amount;
    }
    
    void withdraw(int amount)
    {
        if (amount > balance)
            System.out.println("You don't enough money");
        else
        balance-= amount;
    }
}