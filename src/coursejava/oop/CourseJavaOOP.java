package coursejava.oop;

//Packages
public class CourseJavaOOP {

    public static void main(String[] args) {
        int a =10;
       
        Test test = new Test();
        
        test.changeValue(a);
        System.out.println(a);
        
        Foo foo=new Foo();
        test.changeFoo(foo); //Adress
        System.out.println(foo.x);
}
}

class Test
{
    void changeValue(int var) // int var = 10
   {
       var= var + 5; 
  
   }
    
    void changeFoo(int var) // Foo var = Adress
    {
        var.x = var.x +15;
    }
}

class Foo
{
    int x= 11;
}