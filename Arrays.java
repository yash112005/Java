import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // print sum of a single no.
        int a = 123;
        int orginal = a;
        int sum = 0;
        while(a>0){
           sum += a % 10;
           a = a /10;

        }
        System.out.println(sum);

       // take input in array

        System.out.println("enter size of array:");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array element are:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

        // sum of array
        System.out.println("enter size of array:");
        int size1 = sc.nextInt();
        System.out.println("enter element of array:");
        int [] arr1 = new int[size1];
        for(int i=0;i<size1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("sum of array is:");
        int sum1=0;
        for(int i=0;i<size1;i++){
           sum1 += arr1[i];
        }
        System.out.println(sum1);



         // product of array
//        System.out.println("enter size of array:");
//        int size = sc.nextInt();
//        System.out.println("enter element of array:");
//        int [] arr = new int[size];
//        for(int i=0;i<size;i++){
//            arr[i] = sc.nextInt();
//        }
//        int product=1;
//        for(int i=0;i<size;i++){
//            product *=arr[i];
//        }
//        System.out.println("product of array is:");
//        System.out.println(product);


        // reverse array
        System.out.println("enter size of array:");
        int size2 = sc.nextInt();
        System.out.println("enter element of array:");
        int [] arr2 = new int[size2];
        for(int i=0;i<size2;i++){
            arr2[i] = sc.nextInt();
        }
        for(int k=size2-1;k>=0;k--){
            System.out.println(arr[k]);
        }


        //  max element
        System.out.println("enter size of array:");
        int size3 = sc.nextInt();
        System.out.println("enter element of array:");
        int [] arr3 = new int[size3];

        for(int i=0;i<size3;i++){
            arr3[i] = sc.nextInt();
        }
        int max = arr3[0];
        for(int k=1;k<size3;k++){
            if(arr3[k]>max){
                max = arr3[k];

            }
        }
        System.out.println("max element is:");
        System.out.println(max);


        // second  maximum element in array
        System.out.println("enter size of array:");
        int size4 = sc.nextInt();
        System.out.println("enter element of array:");
        int [] arr4 = new int[size4];

        for(int i=0;i<size4;i++){
            arr4[i] = sc.nextInt();
        }
        int max1 = arr4[0];
        int secmax = Integer.MIN_VALUE;
        for(int k=1;k<size4;k++){
            if(arr4[k]>max){
                secmax = max1;
                max1 = arr4[k];

            }

        }
        System.out.println("max element is:");
        System.out.println(secmax);


        // sum of target in array in pairs
        System.out.println("enter size of array:");
        int size5 = sc.nextInt();

        int [] arr5 = new int[size5];
        System.out.println("enter target");
        int target = sc.nextInt();
        System.out.println("enter element of array:");
        for(int i=0;i<size5;i++){
            arr5[i] = sc.nextInt();
        }
        System.out.println("pairs are:");
        for(int k=0;k<size5;k++){
          for(int j =k+1;j<size5;j++){
              if(arr5[k]+arr5[j]==target){
                  System.out.println("("+arr5[k]+","+arr5[j]+")");
              }
          }
        }


        //  sum of two array in single no.
        int []arr6 = {1,2,3,4,5};
        int []arr7 = {1,2,3,4,5};
        int sum2 = 0;
        int sum3 = 0;
        System.out.println("sum of array 1:");
        for(int i=0;i< arr6.length;i++){
            sum2 +=arr6[i];
        }
        System.out.println(sum2);
        System.out.println("sum of array 2:");
        for(int j=0;j< arr7.length;j++){
            sum3 +=arr7[j];
        }
//        System.out.println(sum2);
//        System.out.println("sum of both arrays:");
//        int sum = sum2 +sum3;
//        System.out.println(sum);



        // store both of array sums in array
        int []arr8 = {1,2,3,4,5};
        int []arr9 = {1,2,3,4,5};
        int [] sum4 = new int[5];
        for(int i=0;i<5;i++) {
           sum4[i] = arr8[i] + arr9[i];
        }
        for(int i=0;i<5;i++){
           System.out.println(sum4[i]);
        }


        // compare two array
        int []arr10 = {1,2,3,4,5,6,7,8};
        int []arr11 = {1,2,3,4,5,6,7,8};

        if(arr10.length == arr11.length){
           System.out.println("equal");

        }
        else{
           System.out.println("not equal");
        }



        // merge two array
        int []arr12 = {1,2,3,4,5,6};
        int [] arr13 = {7,8,9,10,11,12};
        int [] merge = new int[arr12.length +arr13.length];
        for (int i=0;i<arr12.length;i++){
           merge[i] = arr12[i];
        }
        for (int i=0;i<arr13.length;i++){
            merge[arr12.length + i] = arr13[i];
        }
        for(int k:merge){
            System.out.println(k);
        }



        // common element in two array
        int []arr14 = {1,2,3,4,5,6};
        int [] arr15 = {7,8,9,10,5,6};
        for(int i=0;i<arr14.length;i++){
        for(int j=0;j<arr15.length;j++){
            if(arr14[i]==arr15[j]){
                System.out.println(arr14[i]);
            }
        }



        // sum of 2d array
        int [][] arr16 = {{1,2,3,4},{1,2,3,4,5}};
        int sum6 = 0;
        for(int l=0;l< arr16.length;l++){
            for(int j=0;j<arr16[i].length;j++){
                sum6 += arr16[i][j];
            }
        }
        System.out.println(sum6);



        // copy element of one array into another
        int [] num = {5,10,15};
        int [] num1 = new int[num.length];
        for(int i=0;i<num.length;i++){
            num1[i]=num[i];
        }
            System.out.println("copy array is:");
        for(int j:num1){
            System.out.println(j + " ");
        }

        // find maximum of two array
        int [] number = {1,9,3};
        int [] number1 = {5,6,8};
        int Max = Integer.MIN_VALUE;
        for(int h : number){
            if(h  > Max){
                Max = h;
            }
        }
        for(int t:number1){
            if(t > Max){
                Max = t;
            }
        }
            System.out.println("max element is :" + Max);



    }

    }
}
