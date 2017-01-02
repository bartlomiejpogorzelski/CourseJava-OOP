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
    
    Point p= new Point(33,88);
    Point p2= new Point(334,848);

        System.out.println(p.x);
        System.out.println(p.y);
        
        System.out.println(p2.x);
        System.out.println(p2.y);
    }
    
}

class Point 
{
    int x;
    int y;
    Point()
    {
        System.out.println("This default constructor ");
        x=100;
        y=110;
    }
    Point(int first, int second)
    {
        x=first;
        y=second;
    }
}