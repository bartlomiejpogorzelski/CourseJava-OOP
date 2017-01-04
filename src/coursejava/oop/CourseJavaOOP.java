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
    }
}
class BankAccount
{
    private int balance;
    
    int getBalance()
    {
        return balance;
    }
}