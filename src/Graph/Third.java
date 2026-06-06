package Graph;

import java.util.Scanner;
import java.util.ArrayList;

class Pair{
        int vertex;
        int weight;

        public Pair(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
        @Override
        public String toString() {
            return "(" + this.vertex + "," + this.weight + ")" ;
        }
    }
    public class Third {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the  no of vertex");
            int n = sc.nextInt();
            System.out.println("enter the no of edges");
            int m = sc.nextInt();

            ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

            for (int i = 0; i <= n; i++) {
                adj.add(new ArrayList<>());
            }

            for (int i = 0; i < m; i++) {
                System.out.println("enter the " + i + " edge");
                int u = sc.nextInt();
                int v = sc.nextInt();
                int w = sc.nextInt();

                adj.get(u).add(new Pair(v, w));
                adj.get(v).add(new Pair(u, w));
            }

//        for(ArrayList<Pair> it : adj){
//            for(Pair i : it){
//                System.out.print("(" + i.vertex + "," + i.weight + ")");
//            }
//            System.out.println();
//        }
            for (ArrayList<Pair> it : adj) {
                for (Pair i : it) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

        }

//        public static void main(String[] args) {
//
//        }
    }
