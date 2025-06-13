import java.awt.*;

public class Encapsulation {
    public static class BankAccount {
        private double balance;
        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }

        public double getBalance() {
            return balance;
        }

    }


    // 2.
     static class Student{
        private String name;
        private int marks;
        public Student(String name ,int marks){
            this.name  = name;
            setMarks(marks);
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getMarks(){
            return marks;
        }
        public void setMarks(int marks){
            if(marks >=0 && marks <=100){
                this.marks = marks;
            }
        }
        public void getdetails(){
            System.out.println("student name is : "+ name);
            System.out.println("student marks is : "+ marks);
        }


    }
    // 3.
    static class Employee{
        private int id;
        private String name;
        private int salary;
        public Employee(int id,String name,int salary){
            this.id = id;
            this.name = name;
            setSalary(salary);
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getId(){
            return id;
        }
        public  void setId(int id){
            this.id = id;
        }
        public int getSalary(){
            return salary;
        }
        public void setSalary(int salary){
            this.salary = salary;
        }
        public void getdetails(){
            System.out.println("employee id is : " + id);
            System.out.println("employee name is : "+ name);
            System.out.println("employee salary is : " + salary);
        }
    }
    // 4.
    static class Temperature {
        private double celsuis;

        public Temperature(double celsuis) {
            this.celsuis = celsuis;

        }

        public void setCelsuis(double celsuis) {
            this.celsuis = this.celsuis;

        }

        public double getcelsuis() {
            return celsuis;
        }

        public double getfahrenheit() {
            return (celsuis * 9 / 5) + 32;
        }





    }
    // 5.
    static class Rectangle{
        private int length;
        private int width;
        public Rectangle(int length,int width){
            this.length = length;
            this.width = width;
        }
        public void setLength(int length){
            this.length = length;
        }
        public void setWidth(int width){
            this.width = width;
        }
        public int getLength(){
            return length;
        }
        public int getWidth(){
            return width;
        }
        public int getArea(){
            return length*width;
        }
        public int getPerimeter(){
            return 2*(length+width);
        }
    }
    public static void main(String[] args) {
        // 1.
        BankAccount account = new BankAccount(10000);
        account.deposit(152300.23);
        account.withdraw(4500.00);
        System.out.println("Final Balance: " + account.getBalance());

        // 2.
        Student s = new Student("aman",95);
        s.getdetails();
        s.setName("raj");
        s.setMarks(96);
        s.getdetails();

        //3.
        Employee e = new Employee(123,"ajay",1500000);
        e.getdetails();
        e.setId(231);
        e.setName("mohan");
        e.setSalary(1565100);
        e.getdetails();

        //4.
        Temperature t = new Temperature(25);
        System.out.println("temp in celsuis : " + t.getcelsuis());
        System.out.println("temp in fahren : " + t.getfahrenheit());

        //5.
        Rectangle r = new Rectangle(4,5);
        System.out.println("area of rectangle is : " + r.getArea());
        System.out.println("perimeter of rectangle is  : " + r.getPerimeter());



    }
}
