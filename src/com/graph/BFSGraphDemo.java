package com.graph;

public class BFSGraphDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFSGraph g= new BFSGraph(6);
		g.add(0, 2);
		g.add(0, 1);
		g.add(1, 4);
		g.add(1, 3);
		g.add(1, 0);
		g.add(3, 1);
		g.add(4, 1);
		g.add(2, 5);
		g.add(2, 0);
		g.add(5, 2);
		 g.BFSExplore(0);
		 
		 
		 
		 
		 
		
	}

}
