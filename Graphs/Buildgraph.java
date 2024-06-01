package Graphs;

import java.util.ArrayList;

public class Buildgraph {

    static class edge {
        int source;
        int destination;
        int weight;

        edge(int s, int d, int w) {
            this.source = s;
            this.destination = d;
            this.weight = w;
        }

    }

    public static void creategraph() {

        int vertice = 5;

        ArrayList<edge> gr[] = new ArrayList[vertice];

        for (int i = 0; i < gr.length; i++) {
            gr[i] = new ArrayList<>();
        }

        for (int i = 0; i < gr.length; i++) {
            gr[i] = new ArrayList<>();
        }

        gr[0].add(new edge(0, 1, 5));

        gr[1].add(new edge(1, 0, 5));
        gr[1].add(new edge(1, 2, 1));
        gr[1].add(new edge(1, 3, 3));

        gr[2].add(new edge(2, 1, 1));
        gr[2].add(new edge(2, 3, 1));
        gr[2].add(new edge(2, 4, 2));

        gr[3].add(new edge(3, 1, 3));
        gr[3].add(new edge(3, 2, 1));

        gr[4].add(new edge(4, 2, 2));

        for (int i = 0; i < gr[2].size(); i++) {

            edge e = gr[2].get(i);

            System.out.print(e.destination);

        }

    }

    public static void main(String[] args) {
        // int verices =5;
        // ArrayList<edge> gr=new ArrayList<>(verices);

        creategraph();
    }
}
