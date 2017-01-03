package coursejava.oop;


public class CourseJavaOOP {

    public static void main(String[] args) {
        
      
//        double i = Math.add(13, 43);
//        System.out.println(i);
    Customer[] a = new Customer[3];
    a[0]= new Customer("Bart");
    a[1]= new Customer("Ada");
    a[2]= new Customer("Paw");
    
        System.out.println(a[0].id);
        System.out.println(a[1].id);
        System.out.println(a[2].id);
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
    //id+=1; - only this is bad
    id =nextid;
    nextid++;
    }
}