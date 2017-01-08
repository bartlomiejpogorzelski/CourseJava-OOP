
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
        bottle[0]= new Bottle(5);
        bottle[0]= new Bottle(1);
    }
    
    void fill(double amount)
    {
        this.amountWater += amount;
    }
    
    void pour(double amount)
    {
        this.amountWater -= amount;
    }
}
