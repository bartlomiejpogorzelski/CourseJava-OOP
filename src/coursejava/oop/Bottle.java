
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
       
        bottle[0]= new Bottle();
        bottle[0]= new Bottle();
        bottle[0]= new Bottle();
    }
}
