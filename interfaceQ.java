public class interfaceQ {
    // 1.
    interface Walkable{
        void walk();
        void run();
    }
    interface Runable{
        void walk();
        void run();
    }
     static class Person implements Walkable,Runable{
        public void walk(){
            System.out.println("walking....");
        }
        public void run(){
            System.out.println("running.....");
        }
    }


    // 2.
    interface A {
        void display();
    }

    interface B {
        void display(); // Corrected method name
    }

    static class Demo implements A, B {
        public void display() {
            System.out.println("Displaying.....");
        }
    }


    // 3.
    interface Animal{
        void makesound();
    }
    static class Dog implements Animal{
       public void makesound(){
           System.out.println("bark....");
        }
    }



    // 4.
    interface Shape{
        void area(int r);

    }
     static class Circle implements Shape{
        public void area(int r){
            System.out.println(3.1415*r*r);
        }
    }



    // 5.
    interface Vehicle{
        void start();
    }
     static class Car implements Vehicle{
        public void start(){
            System.out.println("vehicle is starting....");
        }
    }
    
    public static void main(String[] args) {
        Person p = new Person();
        p.run();
        p.walk();

        //2.
        Demo d = new Demo();
        d.display();

        // 3.
        Dog d1 = new Dog();
        d1.makesound();

        // 4.
        Circle c = new Circle();
        c.area(5);

        // 5.
        Car c1 = new Car();
        c1.start();


    }
}
