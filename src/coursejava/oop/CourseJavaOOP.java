package coursejava.oop;


public class CourseJavaOOP {

    public static void main(String[] args) {
        
      
//        double i = Math.add(13, 43);
//        System.out.println(i);
    Customer a = new Customer("adam");
    Customer b = new Customer("Bartek");
    Customer c = new Customer("Czeslaw");
    
        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);
    }
}

class Math
{
    static double add(double a, double b)
    {
    return a+b;
    }
}

class Customer
{
    String name;
    int id=0; 
    static int nextid=1;
    Customer(String name)
    {
    this.name=name;
    //id+=1; - that is bad
    id =nextid;
    nextid++;
    }
}