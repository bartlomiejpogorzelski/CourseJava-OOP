package coursejava.oop;

//Packages
public class CourseJavaOOP {

    public static void main(String[] args) {
        int a =10;
       
        Test test = new Test();
        
        a= test.changeValue(a);
        System.out.println(a);
                
}
}

class Test
{
   int changeValue(int var) // int var = 10
   {
       var= var + 5; 
        return var; 
   } 
}