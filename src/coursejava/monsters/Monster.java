
package coursejava.monsters;


public class Monster {
    public double hitPoints;
    public double speed;
    
    public Monster()
    {
        
    }
    
    public Monster(double hitPoints, double speed)
    {
        this.hitPoints=hitPoints;
        this.speed=speed;
    }
    public void Attack()
    {
        System.out.println("I'm attacking from monster class"); 
    }
}
