// class and object practise question
class Student{ // Q1.

}

class Car{  // Q2.
    String Color;
}

class Book{   // Q3.
    String tittle;
    String author;
}

class Rectangle{  // Q4.
    int length;
    int width;

}

class Bankaccount{ // Q5.
    int balance;
}

class Dog{  // Q6.
    String name;

}

class Mobile{ // Q7.
    String brand;
    String model;
}

class Employee{ // Q8.
    String name;
    int id;
    int salary;
}

class Circle{ // Q9.
    int radius;
    double pi;
}

class Laptop{ // Q10.
    String brand;
    int ram;
    int storage;
}

class Counter{ // Q11
    static int count = 0;

    // Constructor to increment count whenever an object is created
    public Counter() {
        count++;
    }

}

class Employees{ // Q12
    static String company_name = "TechCorp Pvt Ltd";


}

class Students {// Q13
    static String school_name = "Greenfiled high school";
    String name;

    public Students(String name) {
        this.name = name;
    }
}

class Cars{ // Q14
    static int wheels = 21; // in inches
    String color;
    public Cars(String color){
        this.color = color;
    }
}

class Banks{ // Q15
    static String bank_name = "HDFC";
    String acc_holder;
    public Banks(String acc_holder){
        this.acc_holder = acc_holder;
    }
}







public class ClassAndObject {
    public static void main(String[] args) {

        // Q1.  create class named student with no attributes create an object of this class and print its address

        Student s = new Student();
        System.out.println(s);


        // Q2. Create a class named Car with an instance variable color. Create an object of this class and
        //assign the color "Red" to it. Print the color.
        Car c1 = new Car();
        c1.Color = "Red";
        System.out.println(c1.Color);

        // Q3. Create a class named Book with two instance variables: title and author. Create an object and
        //assign values to these variables. Print the values.
        Book b1 = new Book();
        b1.tittle = "wings of fire";
        b1.author  = "xyz";
        System.out.println(b1.tittle);
        System.out.println(b1.author);

        //Q4. Create a class named Rectangle with instance variables length and width. Create an object and
        //assign values to these variables. Print the area of the rectangle.
        Rectangle r = new Rectangle();
        r.length = 10;
        r.width = 4;
        System.out.println(r.length * r.width);

        //Q5. Create a class named BankAccount with an instance variable balance. Create an object and
        //assign an initial balance of 1000. Print the balance.
        Bankaccount e1 = new Bankaccount();
        e1.balance = 1000;
        System.out.println(e1.balance);

        // Q6. Create a class named Dog with an instance variable name. Create 3 objects of this class and
        //assign different names to each. Print the names.
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        d1.name = "rocky";
        d2.name = "bruzo";
        d3.name = "jonny";
        System.out.println(d1.name);
        System.out.println(d2.name);
        System.out.println(d3.name);


        // Q7. Create a class named Mobile with instance variables brand and model. Create 2 objects and
        //assign different values to each. Print the details of both mobiles.
        Mobile m1=  new Mobile();
        Mobile m2=  new Mobile();
        m1.brand = "samsung";
        m1.model = "A56";
        m2.brand = "samsung";
        m2.model = "A36";
        System.out.println(m1.brand);
        System.out.println(m1.model);
        System.out.println(m2.brand);
        System.out.println(m2.model);

        // Q8.Create a class named Employee with instance variables name, id, and salary. Create 3 objects
        //and assign values to each. Print the details of all employees.
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        System.out.println("details of e2 employee");
        e2.name = "rahul";
        e2.id = 1234;
        e2.salary = 5000000;
        System.out.println("name:"+e2.name);
        System.out.println("id:"+e2.id);
        System.out.println("salary:"+e2.salary);

        System.out.println("details of e3 employee");
        e2.name = "mohit";
        e2.id = 1284;
        e2.salary = 6000000;
        System.out.println("name:"+e2.name);
        System.out.println("id:"+e2.id);
        System.out.println("salary:"+e2.salary);
        System.out.println("details of e4 employee");
        e2.name = "mohan";
        e2.id = 4879;
        e2.salary = 7000000;
        System.out.println("name:"+e2.name);
        System.out.println("id:"+e2.id);
        System.out.println("salary:"+e2.salary);

        // Q9.Create a class named Circle with an instance variable radius. Create 2 objects and assign
        //different radii. Print the circumference of both circles.
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        c2.radius = 4;
        c3.radius = 6;
        System.out.println("circumference of 1st circle");
        System.out.println(2* 3.1415* c2.radius);
        System.out.println("circumference of 2nd circle");
        System.out.println(2* 3.1415* c3.radius);

        // Q10. Create a class named Laptop with instance variables brand, ram, and storage. Create 3 objects
        //and assign values to each. Print the details of all laptops.
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        Laptop l3 = new Laptop();
        System.out.println("detail of 1st laptop");
        l1.brand = "HP";
        l1.ram = 16;
        l1.storage = 512;
        System.out.println("brand:"+l1.brand);
        System.out.println("ram:"+l1.ram);
        System.out.println("storage:"+l1.storage);
        System.out.println("detail of 2nd laptop");
        l2.brand = "lenovo";
        l2.ram = 8;
        l2.storage = 512;
        System.out.println("brand:"+l2.brand);
        System.out.println("ram:"+l2.ram);
        System.out.println("storage:"+l2.storage);
        System.out.println("detail of 3rd laptop");
        l3.brand = "dell";
        l3.ram = 16;
        l3.storage = 256;
        System.out.println("brand:"+l3.brand);
        System.out.println("ram:"+l3.ram);
        System.out.println("storage:"+l3.storage);

        // Q11.. Create a class named Counter with a static variable count. Increment this variable every time an
        //object is created. Print the count after creating 3 objects.
                // Create three objects
                Counter obj1 = new Counter();
                Counter obj2 = new Counter();
                Counter obj3 = new Counter();

                // Print the count
                System.out.println("Number of objects created: " + Counter.count);



        // Q12. Create a class named Employee with a static variable company_name. Assign a value to this
        //variable and print it using the class name.
        System.out.println("Company Name: " + Employees.company_name);



        // Q13. Create a class named Student with a static variable school_name and an instance variable name.
        //Create 2 objects and print the school name and student names.
       Students s2 = new Students("rahul");
       Students s3 = new Students("alice");
        System.out.println("school name:"+Students.school_name);
        System.out.println("student 1:"+s2.name);
        System.out.println("student 2:"+s3.name);


        // Q14.  Create a class named Car with a static variable wheels and an instance variable color. Assign
        //values to both and print them.
        Cars car = new Cars("black");
        System.out.println("wheels:"+Cars.wheels);
        System.out.println("color:"+car.color);

        // Q15. Create a class named Bank with a static variable bank_name and an instance variable
        //account_holder. Create 2 objects and print the bank name and account holder names.
        Banks b6 = new Banks("rohit");
        Banks b7 = new Banks("mohan");
        System.out.println("bank name:"+Banks.bank_name);
        System.out.println("customer 1:"+ b6.acc_holder);
        System.out.println("customer 2:"+b7.acc_holder);












    }
}





