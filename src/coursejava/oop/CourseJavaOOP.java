package coursejava.oop;


public class CourseJavaOOP {

    public static void main(String[] args) {
    /*
     Objects - containers that stores variables and functions thematically
                connected to each other for easier future usage
     Classes - forms for creating instances (copies) of objects   
    
     Properties - features (part of something)
     Methods - functions
       */
    Test t = new Test();
    t.printSomethingOut("Bartek", "Pogorzelski");
    t.printSomethingOut("Janina", "Pogorzelska");
    t.printSomethingOut("Bartek", "Pogorzelski");
    t.printSomethingOut("Janina", "Pogorzelska");
    
    double result = t.add(43.44,80.78);
      // or: int result= t.add(20, 30);
    System.out.println(result);
    
    }
    
}

class Test
{
    void printSomethingOut(String name, String surname)
    {
        System.out.println("Name:"+ name );
        System.out.println("Surname:"+ surname );
    }
    int add(int a, int y)
    {
        return a+y;
    }
    double add(double a, double y)
    {
        return a+y;
    }
    double divide(int a, int y)
    {
        if (y==0) 
            return 0;
        
        System.out.println("It doesn't show in the case 0");
        return a / y;
    }
            
            
}