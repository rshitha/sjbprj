package sjb.timecomplexity;
import java.util.ArrayList;
public class graph {
	ArrayList<ArrayList<Integer>>graph;
	int v;
	graph(int nodes){
		v=nodes;
		graph=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<v;i++) {
			graph.add(new ArrayList<Integer>());
		}
		
	}
	void edge(int v,int u)
	{
		graph.get(v).add(u);
		graph.get(u).add(v);
	}
	void printgr()
	{
		for(int i=0;i<v;i++)
			
		{
			System.out.println("Node"+i);
			for(int x:graph.get(i))System.out.println("->"+x);
		}
	}
	public static void main(String[]args) {
		graph g=new graph(5);
		g.edge(0, 1);
		g.edge(3, 2);
		g.edge(2, 4);
		
		
		
		g.printgr();
	}

}
