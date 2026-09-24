import java.util.Scanner;

public class Arrays {
    // 1D arrays basic
    public static void main(javaString[] args) {
        //declaration
//        int[] arr;
        //initialization
//        int[] arr1 = new int[5];
        //or
        int[] arr2= {4,-2,3,42,1,1,11,5,9,3, 4, 5};

//        Traversal
//        for (int i=0 ; i<arr1.length;i++){
//            System.out.println(arr1[i]);
//        }


        // 1D array problem

        //Problem 1: Sum of Elements
//        int sum =0;
//        for (int i =0;i<arr2.length;i++){
//            sum +=arr2[i];
//        }

        //Problem 2: Maximum Element
//        int max=arr2[0];
//        for (int i =0;i<arr2.length;i++){
//            if (arr2[i]>max){
//                max=arr2[i];
//            }
//
//        }
//        System.out.println(max);


        //Problem 3: Minimum Element
//        int max1=arr2[0];
//        for (int i =0;i<arr2.length;i++){
//            if (max1>arr2[i]){
//                max1=arr2[i];
//            }
//
//        }
//        System.out.println(max1);


        //Problem 4: Reverse Array (Two Pointer)
//        int start=0 ,end=arr2.length-1;
//        while(start<end){
//            int temp = arr2[start];
//            arr2[start]=arr2[end];
//            arr2[end]=temp;
//            start++;
//            end--;
//        }
//

        //Problem 5: Linear Search
        Scanner sc =new Scanner(System.in);

//        System.out.println("enter the number ");
//        int target=sc.nextInt();
//        for (int i =0;i<arr2.length;i++){
//            if (target==arr2[i]){
//                System.out.println("present "+target);
//                break;
//            }
//            else {
//                System.out.println("not found");
//                break;
//            }
//
//        }

                //2D array//
        //declaration
        int[][] matrix;
        // initialization
        int[][] matrix1 = new int[3][4];
            // or
        int[][] matrix2={{1,2,3},{5,6,7},{2,4,6}};

        //Accessing Elements
//        System.out.println(matrix2[2][1]);
        //->  matrix[row][ column]


        //Traversing 2D Array
//        for (int i =0;i<matrix2.length;i++) {
//            for (int j=0;j<matrix2[i].length;j++){
//                System.out.print(matrix2[i][j] +" ");
//            }
//            System.out.println();
//        }


        //Problem 1: Print Matrix
//
//        int [][] matrix3={
//                {1,2,3},{4,5,6}
//        };
//        for (int i=0;i<matrix3.length;i++){
//            for (int j=0;j<matrix3[i].length;j++){
//                System.out.print(matrix3[i][j]+" ");
//            }
//            System.out.println();
//        }

        //Problem 2: Row-wise Sum
//        int sum =0;
//        for (int i=0;i<matrix2.length;i++){
//            sum=0;
//            for (int j=0 ;  j <matrix2[i].length;j++){
//                sum+=matrix2[i][j];
//            }
//            System.out.println(sum);
//        }

        // Problem 3: Column-wise Sum
//        for (int j=0;j<matrix2[j].length;j++){
//            int sum=0;
//            for (int i =0;i<matrix2.length;i++){
//                sum +=matrix2[i][j];
//
//            }
//            System.out.println(sum);
//        }

        //Problem 4: Find Maximum Element
//        int max=matrix2[0][0];
//        for (int i=0;i<matrix2.length;i++){
//            for (int j=0;j<matrix2[i].length;j++){
//                if (max<matrix2[i][j]){
//                    max=matrix2[i][j];
//                }
//            }
//        }
//        System.out.println("max: "+max);




            //Problem 5: Transpose of Matrix
//        int[][] matrix4 = {
//                {1, 2, 3},
//                {4, 5, 6} };
//        for (int j =0;j<matrix4[0].length;j++ ){
//            for (int i =0;i<matrix4.length;i++){
//                System.out.print(matrix4[i][j] + " ");
//            }
//            System.out.println();
//
//        }


        //Assignment Problems (2D Arrays)

        //1. Print Diagonal Elements
        //1 2 3 4 5 6 7 8 9 Output: 1 5 9

        int[][] arr2D={{1,2,3},{4,5,6},{7,8,9}};
//        for (int i =0;i<arr2D.length;i++){
//            for (int j=0;j<arr2D[i].length;j++){
//                if(i==j){
//                    System.out.print(arr2D[i][j] +" ");
//                }
//            }
//        }


        //2. Sum of Diagonal
//
//        int sum =0;
//        for (int i =0;i<arr2D.length;i++){
//            for (int j=0;j<arr2D[i].length;j++){
//
//                if (i==j){
//                    sum +=arr2D[i][j];
//
//                }
//            }
//
//        }
//        System.out.print(sum);
//
//

        //3. Search Element in Matrix

//        System.out.println("enter you searching no ");
//        int search=sc.nextInt();
//        boolean found=false;
//
//        for (int i=0;i<arr2D.length;i++){
//            for(int j=0;j<arr2D[i].length;j++){
//                if (search==arr2D[i][j]){
//                    System.out.println("Element is found: " + arr2D[i][j]);
//                    found=true;
//
//                }
//            }
//        }
//        if(!found){
//            System.out.println("not found");
//        }

        //Check Matrix is Symmetric
//        boolean symmetric =true;
//        for(int j=0;j<arr2D[0].length;j++){
//            for (int i=0;i<arr2D.length;i++){
//                if (arr2D[i][j]!=arr2D[j][i]){
//                    symmetric =false;
//                }
//            }
//        }
//        if(symmetric){
//            System.out.println("matrix is symmetrix");
//        }
//        else {
//            System.out.println("matric is not symmetrix");
//        }




        //spiral problem
        int[][] matrixs = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };































































    }







}
