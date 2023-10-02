//package pkg1;
import java.util.*;
public class Dijikstra {
	
	

	static class edge{		
		int src;
		int des;
		int wt;
		
		
		
		edge(int s, int d,int w){
			this.src=s;
			this.des=d;
			this.wt=w;
		}
		
	}
	
	
	
	
	static class pair implements Comparable<pair>{
		int node;
		int path;
		
		pair(int n,int p){
			this.node=n;
			this.path=p;
			
			
			
			
		}
		
		@Override
		public int compareTo(pair p9) {
			return this.path - p9.path;
		}
		
		
	}
	
	public static void dikji(ArrayList<edge>[] a, int src) {
		int dis[]=new int [a.length]; 
		for(int i=0;i<a.length;i++) {
			if(i!=src) {
			dis[i]=Integer.MAX_VALUE;
			}
		}
		
		
		boolean visit[]=new boolean[6];
		
		PriorityQueue<pair> pq = new PriorityQueue<>();
		
		pq.add(new pair(src,0));
		while(!pq.isEmpty()) {
			pair curr = pq.remove();
			if(!visit[curr.node]) {
				visit[curr.node]= true;
				
				for(int i=0;i<a[curr.node].size();i++) {
					int u = a[curr.node].get(i).src;
					int v = a[curr.node].get(i).des;
					int wei=a[curr.node].get(i).wt;
					
					if(dis[u]+wei < dis[v]) {
						dis[v] = dis[u]+wei;
						
						pq.add(new pair(v,dis[v]));
					}

					
					
				}
					
					
					
					
					
				
			}
		}
		
		for(int i=0;i<6;i++) {
			System.out.println( i +"="+ dis[i]);
		}
		
		
	}
	

	public static void main(String[] args) {
		int  v = 6;
		
		ArrayList<edge> a [] = new ArrayList[v];
		
		for(int i =0;i<a.length;i++) {
			
			a[i] = new ArrayList<>();
			
			
		}
		
		a[0].add(new edge(0,1,2));
		a[0].add(new edge(0,2,4));

		a[1].add(new edge(1,3,7));
		a[1].add(new edge(1,2,1));

		a[2].add(new edge(2,4,3));

		
		a[3].add(new edge(3,5,1));

		
		a[4].add(new edge(4,3,2));
		a[4].add(new edge(4,5,5));

		
		
		int src =0;
		
		dikji( a,src);
		
		
		
	}

}
