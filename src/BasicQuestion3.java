import java.util.Scanner;
public class BasicQuestion3 {
    public static void main(String[] args) {
        // Q1.check even or odd using if-else by taking input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }


        // Q2. check positive,negative or zero
        int x = sc.nextInt();
        if(x > 0){
            System.out.println("Positive");
        }
        else if(x < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }


        // Q3. find greatest no. of two number using if-else
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b){
            System.out.println("a is greatest");
        }
        else{
            System.out.println("b is greatest");
        }


        // Q4. check whether a character is vowel or consonant using switch-case
        String s = sc.next();
        switch(s){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");

        }


        // Q5. print no. from 1 to N using for loop
        int c = sc.nextInt();
        for(int i=1;i<=c;i++){
            System.out.println(i);

        }

        // Q6. sum of first n natural no. using while loop
        int d = sc.nextInt();
        int i = 1;
        int sum = 0;
        while( i <= d){
            sum  = sum + i;
            i++;
        }
        System.out.println("sum is :"+ sum);



        // Q7. print multipilcation table of no. using loop

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        for (int t = 1; t <= 10; t++) {
            System.out.println((number * t) + "  " );
        }


        // Q8. check whether the no. is divisible by 5 and 11 using if else
        int z = sc.nextInt();
        if( z % 5 ==0 && z % 11 == 0){
            System.out.println("divisible");
        }
        else{
            System.out.println("not divisible");
        }


        // Q9. typercasting ex
        int no = sc.nextInt();
        float so = (float) no;
        System.out.println(so);

        // float to int
        float f = sc.nextFloat();
        int g = (int) f;
        System.out.println(g);



        // Q10. check no. is multiple of 3 or not using if else
        int o = sc.nextInt();
        if( o % 3 == 0){
            System.out.println("multiple of 3");
        }
        else{
            System.out.println("not multiple of 3");
        }


        // Q11. take character input and print ascii value
       char ch = sc.next().charAt(0);
        int ascii = (int)ch;
        System.out.println(ascii);


        // Q12.find factorial of no. using for loop
        int h = sc.nextInt();
        int product = 1;
        for(int j=1;j<=h;j++){
            product *=j;
        }
        System.out.println(product);


        // Q13. write a program to reverse no. using while loop
        int j = sc.nextInt();
        int rev = 0;
        while(j !=0){
            int digit = j %10;
            rev = rev *10 + digit;
            j /=10;
        }
        System.out.println(rev);


        // Q14.check no is prime or not using loop or if-else
        int k = sc.nextInt();
        boolean prime = true;
        for(int l=2;l<=k/2;l++){
            if(k % l==0){
                prime = false;
                break;
            }
        }
        System.out.println(prime ? "prime":"not prime");



        // Q15. using switch case to build simple calculator (add,sub,mul,div)
        int v = sc.nextInt();
        int p = sc.nextInt();
        char w =sc.next().charAt(0);
        switch (ch){
            case '+':
                System.out.println(v+p);
                break;
            case '-':
                System.out.println(v-p);
                break;
            case '*':
                System.out.println(v*p);
                break;
            case '/':
                if(p ==0){
                    System.out.println("division by zero is not possible");
                    break;
                }
                else {
                    System.out.println(v/p);
                    break;
                }

        }










    }
}
