package Graph;

import java.util.Scanner;

public class First{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of edges:");
        int n = sc.nextInt();
        System.out.println("Enter  number of nodes:");
        int m = sc.nextInt();
        int[][] matrix = new int[n + 1][n + 1];

        for(int i = 1; i <= m; i++){
            System.out.println("Input of " + i + " edges");;

            int u = sc.nextInt();
            int v = sc.nextInt();

            matrix[u][v] = 1;
            matrix[v][u] = 1;
        }
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < n + 1; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
