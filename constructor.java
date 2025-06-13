public class constructor {
    static class  Student{
        String name;
        int age;
        Student(String name,int age){
            this.name = name;
            this.age = age;
        }
    }

    static class Student1{
        int a;

        Student1(int a) {
            this.a = a;
        }

        void sum(){
            System.out.println(a);
            System.out.println(this);
        }
    }
    static class Employee{
        Employee(){
            System.out.println("i am employee");
        }
        Employee(int a){
            this();
            System.out.println(a);
        }
        Employee(int a,int b){
            this(6);
            System.out.println(a+b);
        }

    }
    public static void main(String[] args) {
        Student s1 = new Student("hello",18);
        System.out.println(s1.name);
        System.out.println(s1.age);
        Student1 s = new Student1(20);
        s.sum();
        Employee e = new Employee(5,6);



    }
}