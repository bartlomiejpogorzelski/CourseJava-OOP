
package coursejava.oop;


public class Bottle {
    double amountWater;
    
    Bottle()
    {
        
    }
    
    Bottle(double amountWater)
    {
        this.amountWater=amountWater;
    }
    
    public static void main(String[] args) {
        
        Bottle[] bottle= new Bottle[3];
       
        bottle[0]= new Bottle(10);
        bottle[1]= new Bottle(5);
        bottle[2]= new Bottle(1);
        
       bottle[0].transferWater(14.0, bottle[2]);
        System.out.println(bottle[0].getWater());
        System.out.println(bottle[2].getWater());
    }
    
    void fill(double amount)
    {
        this.amountWater += amount;
    }
    
    void pour(double amount)
    {
       if ( this.amountWater < amount)
            System.out.println("You dont have water too much");
       else
        this.amountWater -= amount;
               
    }
    
    double getWater()
    {
     return amountWater;    
    }
    
    void setWater(double amountWater)
    {
        this.amountWater=amountWater;
    }
    
    void transferWater(double amount, Bottle transferToBottle){
        this.pour(amount);
        transferToBottle.fill(amount);
    }
}
