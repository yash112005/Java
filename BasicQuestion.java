import java.util.Scanner;

public class BasicQuestion {
    public static void main(String[] args) {

        // Q1. program to print hello world
        System.out.println("hello world");


        // Q2. deaclare variable and all primitive and print them
        byte a =5;
        int b = 10;
        float c = 3.14f;
        long d = 1000;
        double e = 3.1415;
        char f = 'a';
        boolean g = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);



        // Q3. convert int to float and print both
        int p  = 100;
        float fp = p + (float)18.0;
        System.out.println(p);
        System.out.println(fp);



        // Q4. convert double to int print both
        double x= 3.14;
        int y = (int)x;
        System.out.println(x);
        System.out.println(y);



        // Q5. predict the output
        int z ='A';
        System.out.println(z); // it will print the ascii value of a



        // Q6. swap two number using temporary variable
        int r=5,h=4,temp;
        temp = r;
        r = h;
        h = temp;
        System.out.println("r =" + r + ",h=" + h);



        // Q7. swap two number without using third variable
        int i = 4;
        int j = 10;
        i = i+j;
        j = i-j;
        i = i-j;
        System.out.println("i=" + i + "j =" + j);



        // Q8. input a character and print ascii value
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int ascii = ch;
        System.out.println(ascii);




        // Q9. predict the output
        int k = 5;
        double l = 10;
        System.out.println(k+l);  // output is 15.0




        // Q10. declare 2 int and 2 float and all 4 and print them
        int m = 8;
        int n = 9;
        float o=  10;
        float q = 15;
        System.out.println(m+n+o+q); // output 42.0




        // Q11. take name as string and age as int print in format
        Scanner sc1 =  new Scanner(System.in);
        String s = sc.next();
        int age  = sc.nextInt();
        System.out.println("My name is"+" "+ s + " "+ "and I am" +" "+ age  + " "+ "years old");

    }
}





























