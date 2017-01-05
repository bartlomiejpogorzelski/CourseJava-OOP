package coursejava.oop;

//Packages
public class CourseJavaOOP {

    public static void main(String[] args) {
    
        int x = 50;
        int y = x;
        
        y= 14;
        
        System.out.println(x);
        // y is only a copy, so we have 50
        
        //here we assign adress (t) not value.
        Test t =new Test(); // refernce variable beacuse we refer to the place in the memory
        Test t2 = t;
        t2.a=79;
        System.out.println(t.a);//79
        
        
        String name ="Arkadiusz";
        String name2 = name;
        
        name2= "wiola";
        System.out.println(name); // give Arkadiusz
    }
}

class Test
{
    int a = 80;
}