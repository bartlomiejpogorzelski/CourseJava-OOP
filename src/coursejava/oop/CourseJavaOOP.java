package coursejava.oop;


public class CourseJavaOOP {

    public static void main(String[] args) {
        
        Math test = new Math();
        double i = test.add(13, 43);
        System.out.println(i);
    }
}

class Math
{
    double add(double a, double b)
    {
    return a+b;
    }
}