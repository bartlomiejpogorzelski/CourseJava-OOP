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
    
    Point p= new Point();
    
    p.x=10;
    p.y=60;
    
        System.out.println(p.x);
        System.out.println(p.y);
    }
    
}

class Point 
{
    Point()
    {
    
    }
    int x;
    int y;
}