import java.util.Scanner;

public class BasicQuestion2 {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        System.out.println("add:"+(a+b));
        System.out.println("sub:"+(a-b));
        System.out.println("mul:"+(a*b));
        System.out.println("div:"+(a/b));


        // Q2. find modulus using modulus operator
          int c = 10;
          int d = 11;
          System.out.println(c % d);


        // Q3. check whether no is even or odd
         Scanner sc = new Scanner(System.in);
         int e = sc.nextInt();
         if(e % 2==0){
           System.out.println("Even");
         }
         else{
           System.out.println("Odd");
         }


        // Q4. check no is positive or negative
          int f = 4;
          if(f > 0){
            System.out.println("positive");
          }
          else{
            System.out.println("negative");
          }



        // Q5. largest of two number
        int g = 9;
        int h = 4;
        if(g  > h){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }


        // Q6. largest of three number
        int x = 4;
        int y = 6;
        int z = 10;
        if(x > y && x>z){
            System.out.println("a is greatest");
        }
        else if(y>z){
            System.out.println("b is greatest");
        }
        else{
            System.out.println("c is greatest");
        }


        // Q7. check whether it is leap year or not
        int i = 2026;
        if(i %4==0 && (i %100!=0 || i %400==0)){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }


        // Q8. check is no.  is divisible by 5 and 11
        int j = 8;
        if(j % 5==0 && j %11==0){
            System.out.println("divisible");
        }
        else{
            System.out.println("not divisible");
        }



        // Q9. check no. is prime or not
        int k = 10;
        boolean prime = true;
        for(int l=2;l<=k/2;l++){
            if(k % i==0){
                prime = false;
                break;
            }
        }
        System.out.println(prime ? "prime":"not prime");



        // Q10. check eligiblity to vote
        int marks = 90;
        if(marks>=90){
            System.out.println("grade A");
        }
        else if(marks>=75){
            System.out.println("grade B");
        }
        else if(marks>=60){
            System.out.println("grade C");
        }
        else{
            System.out.println("fail");
        }



        // Q11.check whether is uppercase or lowercase
        char ch = 'F';
        if(ch>='A' && ch<='Z'){
            System.out.println("uppercase");
        }
        else if (ch>='a' && ch<='z'){
            System.out.println("lowercase");
        }
        else{
            System.out.println("not alphabet");
        }

    }
}


























