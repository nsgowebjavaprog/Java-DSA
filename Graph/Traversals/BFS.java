package Traversals;

// BFS---------------->Go to immediate Neighbors First

//      1------3 
//     /       | \ 
//    0        |  5------6
//     \       | /
//      2------4

// Level order -----> 0 || 1,2 || 3,4 || 5 || 6
// Result:- 0,1,2,3,4,5,6

// Data Structure is QUEUE---->{FIFO}

//Time Complexity:- O(V+E)-->O(n)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
  static class Edge {
    int src;
    int dest;

    public Edge(int s, int d) {
      this.src = s;
      this.dest = d;
    }
  }

  public static void createGraph(ArrayList<Edge> graph[]) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<Edge>();
    }
    graph[0].add(new Edge(0, 1));
    graph[0].add(new Edge(0, 2));

    graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 3));

    graph[2].add(new Edge(2, 0));
    graph[2].add(new Edge(2, 4));

    graph[2].add(new Edge(3, 1));
    graph[3].add(new Edge(3, 4));
    graph[3].add(new Edge(3, 5));

    graph[3].add(new Edge(4, 2));
    graph[3].add(new Edge(4, 3));
    graph[3].add(new Edge(4, 5));

    graph[3].add(new Edge(5, 3));
    graph[3].add(new Edge(5, 4));
    graph[3].add(new Edge(5, 6));

  }

  public static void bfs(ArrayList<Edge> graph[], int V) {
    Queue<Integer> q = new LinkedList<>();
    boolean vis[] = new boolean[V];
    q.add(0);

    while (!q.isEmpty()) {
      int curr = q.remove();
      if (vis[curr] == false) {
        System.out.println(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
          Edge e = graph[curr].get(i);
          q.add(e.dest);
        }
      }
    }
  }

  public static void main(String[] args) {
    int V = 7;

    //    1------3
    //   /       | \
    //   0       |  5------6
    //   \       | /
    //    2------4

    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);
    bfs(graph, V);
    System.out.println();
  }
}
/*
0
1
2
3
4
5
6

 */