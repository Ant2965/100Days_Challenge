//package pkg1;

import java.util.ArrayList;

import pkg1.Dijiskstra.edge;

public class Bellmanford {
	
	static class edge{
		int src;
		int des;
		int wt;
		
		
		
		edge(int s,int d,int w){
			this.src=s;
			this.des=d;
			this.wt=w;
			
		}
	}

	
	public static void bell(ArrayList<edge> a[],int src) {
		
		int dist[]=new int[a.length];
		for(int i=0;i<dist.length;i++) {
			if(i!=src) {
				dist[i]= Integer.MAX_VALUE;
			}
		}
		
		
		/// algo
		
		int V = a.length;
		
		for(int i=0;i<V-1;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a[j].size();k++) {
					
					int u= a[j].get(k).src;
					int v=a[j].get(k).des;
					int we=a[j].get(k).wt;
					
					
					if(dist[u]!= Integer.MAX_VALUE && dist[u] +we < dist[v]) {
						dist[v]=dist[u]+we;
						
						
					}
					
				}
			}
		}
		
		
		for(int i=0;i<dist.length;i++) {
			System.out.print(dist[i] + "");
		}
		System.out.println();
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		int  v = 6;
		
		ArrayList<edge> a [] = new ArrayList[v];
		
		for(int i =0;i<a.length;i++) {
			
			a[i] = new ArrayList<>();
			
			
		}
		
		a[0].add(new edge(0,1,-2));
		a[0].add(new edge(0,2,4));

		a[1].add(new edge(1,3,-7));
		a[1].add(new edge(1,2,1));

		a[2].add(new edge(2,4,-3));

		
		a[3].add(new edge(3,5,-1));

		
		a[4].add(new edge(4,3,2));
		a[4].add(new edge(4,5,-5));

		
		
		int src =0;
		
		
		bell(a, src);

	}

}
