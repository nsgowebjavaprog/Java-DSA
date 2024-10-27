package Basic;

import java.util.ArrayList;

public class Adjacency_List {
  //Edge class
    static class Edge {
        int src;     //Source
        int dest;    //Destigination
   
      //Constructor  
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    //Create--Graph

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>(); 
            // create empty array
            // Then Assign the value;                                          
        }
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));

    }
    public static void main(String[] args) {
        //System.out.println("Hi. Nagaraj Loni Good morning");
        
        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.print("Adj_of_List is----->");
        //graph---> Array name,  V---> Size


        // Print 2;s neighbours
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.print(+e.dest+ " ");
        }

    }
}// OUTPUT: Adj_of_List is----->0 1 3 