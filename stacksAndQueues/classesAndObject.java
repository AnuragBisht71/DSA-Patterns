package stacksAndQueues;

public class classesAndObject {
    public static class Person{
        String name;
        int age;

        public void saysHi() {
            System.out.println(name+"["+age+"] says hi");
        }
    }

    public static void swap(Person p1 , Person p2) {
        Person temp = p1;
        p1 = p2;
        p2 = temp;
    }

    public static void swap1(Person p1 , Person p2) {
        int age = p1.age;
        p1.age = p2.age;
        p2.age = age;

        String name = p1.name;
        p1.name = p2.name;
        p2.name = name;
    }
    
    public static void game1(Person p1 , Person p2) {
        int age = p1.age;
        p1.age = p2.age;
        p2.age = age;
        p1 = new Person();
        
        String name = p1.name;
        p1.name = p2.name;
        p2.name = name;
        p2 = new Person();
    }
    
    public static void game2(Person p1 , Person p2) {
        int age = p1.age;
        p1.age = p2.age;
        p2.age = age;
        
        p1 = new Person();
        p2 = new Person();
        
        String name = p1.name;
        p1.name = p2.name;
        p2.name = name;
    }
    
    public static void game3(Person p1 , Person p2) {
        int age = p1.age;
        p1.age = p2.age;
        p2.age = age;
        
        String name = p1.name;
        p1.name = p2.name;
        p2.name = name;

        p1 = new Person();
        p2 = new Person();
    }
    
    public static void game4(Person p1 , Person p2) {
        p1 = new Person();
        p2 = new Person();
        
        int age = p1.age;
        p1.age = p2.age;
        p2.age = age;
        
        String name = p1.name;
        p1.name = p2.name;
        p2.name = name;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "abc";
        p1.age = 10;
        Person p2 = new Person();
        p2.name = "def";
        p2.age = 20;

        p1.saysHi();
        p2.saysHi();
        game4(p1,p2);
        p1.saysHi();
        p2.saysHi();
    }
}
