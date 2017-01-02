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
    
    Monitor monitor1= new Monitor();
    monitor1.width=1000;
    monitor1.getWidth();      
        
    Monitor monitor2= new Monitor();
    monitor2.width = 20000;
    monitor2.getWidth();
    
    String name = "Bartlomiej";
    System.out.println(name.charAt(3));
    }
    
}

class Monitor 
{
    int width;
    int hight;
    int brightness;
    
    void changeBrightness()
    {
        
    }
    
    void getWidth()
    {
        System.out.println(width); 
    }
}