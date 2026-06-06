package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertex:");
        int n = sc.nextInt();
        System.out.println("Enter number of edges:");
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < m; i++){
            System.out.println("Enter the " + i + " edge.");
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        System.out.println(adj);
    }
}
