public class functionQuestions {

    // 1.
    public static void naturalno(int n){
        for(int i=0;i<=n;i++){
            System.out.println(i);
        }
    }

    //2.
    public static void evenno(int n1){
        for(int i=1;i<=n1;i++){
            if(i % 2 ==0){
                System.out.println(i);
            }
        }
    }

    // 3.
    public static void reverse(int n2){
        for(int i=n2;i>=0;i--){
            System.out.println(i);
        }
    }

    //4.
    public static int sum(int a){
        int sum = 0;
        for(int i=0;i<a;i++){
            sum +=i;
        }
        return sum;
    }

    // 5.
    public static int product(int b){
        int product = 1;
        for(int i=0;i<b;i++){
            product +=i;
        }
        return product;
    }

    //  6.
    public static void display(int c) {

        while (c > 0) {
            int digits = c % 10;
            System.out.println(digits + " ");
            c = c / 10;
        }
        System.out.println();

    }


    // 7.
    public static int sumofdigit(int d){
        int sum = 0;
        while(d>0){

            sum += d % 10;

            d = d /10;

        }
        return sum;
    }

    // 8.

    public static int count_of_no(int e){
        int count = 0;
        while(e>0){
            int digit = e %10;
            e = e /10;
            count++;
        }
        return count;
    }

    // 9.	WAP to print reverse of a given number
    public static int reverse_no(int f){
        int reverse = 0;
        while (f != 0) {
            int digit = f % 10;
            reverse = reverse * 10 + digit;
            f = f / 10;
        }
        return reverse;
    }

    // 10.
    public static boolean palindrome(int x){
        int original = x;
        int reverse = 0;
        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;

        }
        return  original == reverse;

    }

    // 11.
    public static int fact(int y){
        int product = 1;
        for(int i=1;i<=y;i++){
            product *=i;
        }
        return product;
    }

    // 12.
    public static int factofsum(int z){
        int sum=0;
        int product = 1;
        for(int i=1;i<=z;i++){
            product *=i;
        }
        while(product>0){
            sum += product%10;
            product = product/10;
        }
        return sum;


    }

    // 13.
    public static int displayfact(int l){
        int sum=0;
        int count = 0;
        int product = 1;
        for(int i=1;i<=l;i++){
            product *=i;
        }
        while(product>0){
            int digit = product %10;
            product = product/10;
            count++;
        }
    return count;
    }
    //14.
    public static boolean isprime(int u){
        boolean prime = true;
        for(int l=2;l<=u/2;l++){
            if(u % l==0){
                prime = false;
                break;
            }
        }
        return prime;
    }

    // 15.
    public static boolean primeprint(int u){
        boolean prime = true;
        for(int l=2;l<=u/2;l++){
            if(u % l==0){
                prime = false;
                break;
            }
        }
        return prime;
    }

    // 16.
    public static boolean prime_in_givenrange(int lower, int upper){
        boolean prime = true;
        for(int l=lower;l<=upper/2;l++){
            if(upper % l==0){
                prime= false;
                break;
            }
        }
        return prime;
    }

    // 17.
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }


    // 18.
    public static boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);
        return sqrt == (int) sqrt; // Check if square root is an integer
    }

    // 19.
    public static void perfectSquare() {
        for (int i = 1; i*i <= 100; i++) {
           if(i*i >=1){
               System.out.println((i*i)+ " ");
           }
        }
    }

    // 20.
    public static void perfectSquares(int start,int end) {
        for (int i =start ; i*i <= end; i++) {
            if(i*i >=start){
                System.out.println((i*i)+ " ");
            }
        }
    }

    // 21.
    public static boolean armstrong(int arm){
        int originalNum = arm, sum = 0, digits = String.valueOf(arm).length();

        while (arm != 0) {
            int digit = arm % 10;
            sum += Math.pow(digit, digits);
            arm /= 10;
        }

        return sum == originalNum;
    }

    // 22.
    public static boolean armstrongs(int arm){
        int originalNum = arm, sum = 0, digits = String.valueOf(arm).length();

        while (arm != 0) {
            int digit = arm % 10;
            sum += Math.pow(digit, digits);
            arm /= 10;
        }
        return sum == originalNum;

    }

    // 23.
    public static boolean Armstrong(int arm){
        int originalNum = arm, sum = 0, digits = String.valueOf(arm).length();

        while (arm != 0) {
            int digit = arm % 10;
            sum += Math.pow(digit, digits);
            arm /= 10;
        }
        return sum == originalNum;

    }

    //24.
    public static boolean isHarshad(int num) {
        int sumOfDigits = 0, originalNum = num;


        while (num != 0) {
            sumOfDigits += num % 10;
            num /= 10;
        }


        return originalNum % sumOfDigits == 0;
    }

    //25.
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }


    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 26.
    public static int findGCd(int h, int p) {
        while (p != 0) {
            int temp = p;
            p = h % p;
            h = temp;
        }
        return h;
    }

    // 27.
    public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

   // 28.
   public static void swap(int[] numbers) {
       int temp = numbers[0];
       numbers[0] = numbers[1];
       numbers[1] = temp;
   }

    // 29.
    public static int swapno(int numb){
        String s = Integer.toString(numb);
        int firstdigit = Character.getNumericValue(s.charAt(0));
        int lastdigit = Character.getNumericValue(s.charAt(s.length()-1));
        String swap = lastdigit + s.substring(1,s.length()-1)+firstdigit;
        int swapno = Integer.parseInt(swap);
        return swapno;
    }

    // 30.
    public static int sumofalternateDigit(int dig){
        String s1 = Integer.toString(dig);
        int sum = 0;
        for(int i=0;i<s1.length();i++){
           if(i%2==0){
               sum += Character.getNumericValue(s1.charAt(i));

           }
        }
        return sum;
    }

    // 31.
    public static boolean duck(int numbe){
        String s2 = Integer.toString(numbe);
        return s2.contains("0") && s2.charAt(0)!='0';
    }

    // 32.
    public static boolean isBuzzNumber(int num3) {
        return num3 % 7 == 0 || num3 % 10 == 7;
    }

    // 33.
    public static boolean isMagic(int N)
    {
        int sum = 0;
        while (N > 0 || sum > 9)
        {
            if (N == 0)
            {
                N = sum;
                sum = 0;
            }
            sum += N % 10;
            N /= 10;
        }

        return (sum == 1);
    }

    public static void main(String[] args) {
        // 1.	WAP to print natural numbers up-to 'n'
        int n = 5;
        naturalno(n);

        // 2.	WAP to print all even numbers between two given range
        int n1=6;
        evenno(n1);

        //  3.	WAP to print 'n' natural numbers in reverse order
        int n2 = 5;
        reverse(n2);

        //  4.	WAP to find sum of 'n' natural numbers
        int a = 5;
        int result = sum(a);
        System.out.println(result);

       //5.	WAP to find product of 'n' natural numbers
        int b = 4;
        int result1 = product(b);
        System.out.println(result1);

        //6.WAP to display digit of a number
        int c = 123;
        display(c);


        // 7.	WAP to find sum of all digits in a given number
        int d = 125;
        int result3 = sumofdigit(d);
        System.out.println(result3);

        //  8.	WAP to find the count of all digits in a given number
        int e = 2054;
        int result4 = count_of_no(e);
        System.out.println(result4);

        //9.	WAP to print reverse of a given number
        int f = 1256;
        int resullt4 = reverse_no(f);
        System.out.println(resullt4);

        // 10.	WAP to check a number is palindrome or not
        int x = 121;
        if(palindrome(x)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

        // 11.	WAP to find all factors of a given number
        int y = 4;
        int v = fact(y);
        System.out.println(v);

        // 12.	WAP to find sum of all factors of a given number
        int z = 4;
        int q = factofsum(z);
        System.out.println(q);

        //13.	WAP to count all the factors of a given number and display it
        int l = 5;
        int k = displayfact(l);
        System.out.println(k);

        //14.	WAP to check a number is prime or not
        int u = 13;
        if(isprime(u)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }

        // 15.	WAP to print all prime numbers between 1 to 100
        int o = 100;
        for(int i=2;i<=100;i++){
            if(primeprint(i)){
                System.out.println(i);
            }
        }

        //16.	WAP to print all prime numbers between two given range
        int lower = 2;
        int upper = 10;
        for(int i = lower;i<=upper/2;i++){
            if(prime_in_givenrange(lower,upper)){
                System.out.println(i);
            }
        }

        // 17.	WAP to print alternate prime numbers between 1 to 100
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                count++;
                if (count % 2 != 0) { // Print alternate primes
                    System.out.print(i + " ");
                }
            }
        }

        // 18.	WAP to check a number is perfect or not
        int number = 50;
        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }

        //19.	WAP to print all perfect numbers between 1 to 100
        perfectSquare();

        // 20.	WAP to print all the perfect number between two given range
        perfectSquares(2,90);

        // 21.	WAP to check a number is Armstrong or not
        int arm = 153;
        if (armstrong(arm)) {
            System.out.println(arm + " is an Armstrong number.");
        } else {
            System.out.println(arm + " is not an Armstrong number.");
        }

        // 22.	WAP to print all Armstrong number between 1 to 100

        for (int i = 1; i <= 100; i++) {
            if (armstrong(i)) {
                System.out.print(i + " ");
            }
        }
        // 23.	WAP to print all Armstrong number between two given range
        int start = 2;
        int end = 200;
        for (int i = start; i <= end; i++) {
            if (armstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 24.	WAP to check if a number is a Harshad number
        int t = 18;
        if (isHarshad(t)) {
            System.out.println(t + " is a Harshad number.");
        } else {
            System.out.println(t + " is not a Harshad number.");
        }


        // 25.	WAP to find LCM of two numbers
        int n3 = 36;
        int n4 = 2;
        int lcm = findLCM(36,2);
        System.out.println(lcm);

        //26.	WAP to find GCD (HCF) of two numbers
        int h = 3;
        int p = 9;
        int e1 = findGCd(h,p);
        System.out.println(e1);


        // 27.	WAP to print Fibonacci series up to n terms
        int num = 5;
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i) + " ");
        }

        // 28.	WAP to swap two numbers
        int []numbers = {1,5};
        swap(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);


        // 29.	WAP to swap first and last digit of a number
        int numb = 12345;
        int swaps = swapno(numb);
        System.out.println(swaps);

        // 30.	WAP to calculate the sum of alternate digits in a number
        int dig = 12345;
        int print = sumofalternateDigit(dig);
        System.out.println(print);

        //31.	WAP to check whether the number is duck number
        int numbe = 9085;
        if(duck(numbe)){
            System.out.println("duck number");
        }
        else{
            System.out.println("not duck number");
        }

        // 32.	WAP to check if a number is a Buzz number
        int num3 = 27;
        if(isBuzzNumber(num3)){
            System.out.println("buzz number");
        }
        else{
            System.out.println("not a buzz number");
        }

        // 33.	WAP to check if a number is a Magic Number
        int N = 1234;
        if (isMagic(N)){
            System.out.println("magic number");
        }
        else{
            System.out.println("not magic number");
        }


    }
}
