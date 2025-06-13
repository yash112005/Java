
// abstaract class for payment create two subclasses upipayment and card
abstract class Payment{
    abstract void pay(int a);
    void print(){
        System.out.println("payment done......");
    }
}

class UpiPayment extends Payment{
    void pay(int a){
        System.out.println("payment done by upi "+ a);
    }
}
class Card extends Payment{
    void pay(int a){
        System.out.println("payment done by card "+a);
    }
}



// abstract class shape with an abstract method area implement two subclasses circle and rectangle
abstract class Shape {
    abstract void area(int a,int b,double pi);

}
class Rectangle1 extends Shape{
    @Override
    void area(int r,int b,double pi) {
        System.out.println("area of rectangle is "+ (r*b));
    }
}
class Circle extends Shape{
    @Override
    void area(int a,int b,double pi) {
        System.out.println("area of circle is " +(pi*a*a));
    }
}


// create abstract class animal with method sound create classes dog and cat that extend it and implemnt the sound method
abstract class Animal {
    abstract void sound();

}
class Dog extends Animal{
    void sound(){
        System.out.println("boww....");
    }
}
class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("meowww....");
    }
}




public class abstractClass {

    public static void main(String[] args) {
        Payment obj = new UpiPayment();
        obj.pay(1000);
        obj.print();
        Payment obj1 = new Card();
        obj1.pay(500000);
        obj1.print();


        Shape s = new Rectangle1();
        s.area(5,4,3.1415);
        Shape s1 = new Circle();
        s1.area(5,0,3.1415);


        Animal a = new Dog();
        a.sound();
        Animal b = new Cat();
        b.sound();
    }
}
