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
 
    }
    
}

class Test
{
    void printSomethingOut(String name, String surname)
    {
        System.out.println(name + " " + surname);
    }
}