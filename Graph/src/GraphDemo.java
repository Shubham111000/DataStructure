import java.util.*;
public class GraphDemo {
	int v,visited[],g[][];
	
	void createGraph(int Nodes) 
	{
		v=Nodes;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<v;i++) 
		{
			for(int j=0;j<v;j++) 
			{
				System.out.println("Enter value for V"+i+" to V"+j+" (999 for infinity):");
				g[i][j]=sc.nextInt();
			}
		}
	}
	void Print_G() 
	{
		for(int i=0;i<v;i++) 
		{
			for(int j=0;j<v;j++) 
			{
				System.out.print(g[i][j]+"\t");
			}
			System.out.println();
		}
	}
	void resetvisted() 
	{
		for (int i=0;i<v;i++)
			visited[i]=0;
	}
	void DFS(int Source) 
	{
		visited[Source]=1;
		System.out.println("V"+Source+" visited");
		for(int i=0;i<v;i++) 
		{
			while(g[Source][i]==1&&visited[i]!=1)
				DFS(i);
		}
	
	}
	public boolean DFS_search(int source,int key)
    {
        boolean flag=false;
        if(key==source)
        {
            flag=true;
        }
        visited[source]=1;
        System.out.println("V"+source);
        for(int i=0;i<v;i++)
        {
            if(g[source][i]==1 && visited[i]!=1)//neighbour and unvisited
            {
                DFS_search(i,key);
            }
        }
        return(flag);
    }
	public void BFS(int source)
    {   int q[]=new int[v];
        int front=0,rear=-1;
        visited[source]=1;
        q[++rear]=source;//enqueue
        while(front<=rear)//not empty
        {   int element=q[front++];//dequeue
            System.out.print("V"+element+"-");

            for(int i=0;i<v;i++)
            {  if(g[element][i]==1 && visited[i]!=1)//neighbour and unvisited
                {   visited[i]=1;//visited
                    q[++rear]=i;//enqueue
                }
            }
        }
    }
}
