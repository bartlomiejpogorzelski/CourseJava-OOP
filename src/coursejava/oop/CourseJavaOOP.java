package coursejava.oop;

//Packages
import coursejava.monsters.Monster;


public class CourseJavaOOP {

    public static void main(String[] args) {
    // MONSTERS - ZOMBIES - SKELETONS - hit points, attack, speed
       Monster monster = new Monster(100,10);
       
       monster.Attack();
       
        System.out.println(monster.hitPoints);
        System.out.println(monster.speed);
    }
}