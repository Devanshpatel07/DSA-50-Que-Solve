// package dsa.question;

import java.util.Scanner;

public class lacture26 {
	//sprial matrix transpose
    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j< matrix[i].length; j++){
                System.out.println(matrix[i][j] + "");
            }
            System.out.println();
        }
    }
    static  void printSpralOrder(int[][] matrix , int r , int c){
        int topRow =0, bottomRow = r-1 , leftCol =0 , rightCol = c-1;
        int totalElement = 0;
        while(totalElement < r*c){
            //toprow -> leftcol to rightcol
            for(int j= leftCol; j<=rightCol && totalElement < r*c;j++){
                System.out.print(matrix[topRow][j] + " ");
                totalElement++;
            }
            topRow++;
            //rightcol -> toprow to bottomrow
            for(int i = topRow ; i<= bottomRow && totalElement < r*c ; i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;

            //bottomrow -> rightcol to leftcol
            for(int j = rightCol ; j>= leftCol && totalElement < r*c ; j--){
                System.out.print(matrix[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;
            //leftcol -> bottomrow to toprow
            for(int i = bottomRow ; i>= topRow && totalElement < r*c ; i--){
                System.out.print(matrix[i][leftCol] + " ");
                totalElement++;
            }
            leftCol++;
        }
    }
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and cols of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int total = r*c;
        System.out.println("Enter " + total + " ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
        }
    }
    System.out.println("Input matrix");
    printMatrix(matrix);

    System.out.println("Sprial Matrix");
    printSpralOrder(matrix, r, c);
}
}