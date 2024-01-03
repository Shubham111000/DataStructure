import java.util.*;
public class Graph
{
    int v,visited[],g[][];

    void createGraph(int nodes)
    {   v=nodes;
        Scanner in=new Scanner(System.in);
        g=new int[v][v];
        visited=new int[v];
        for(int i =0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
                System.out.println("Enter value for V"+i+" to V"+j+" (Enter 999 for infinity):");
                g[i][j]=in.nextInt();

            }
        }
    }
    void printGraph()
    {
        for(int i =0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
                System.out.print(g[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void resetvisited()
    {
        for(int i =0;i<v;i++)
        {
            visited[i]=0;
        }

    }



    public void BFS(int source)
    {   int q[]=new int[v];
        int front=0,rear=-1;
        visited[source]=1;
        q[++rear]=source;
        while(front<=rear)
        {   int element=q[front++];
            System.out.print("V"+element+"-");

            for(int i=0;i<v;i++)
            {  if(g[element][i]==1 && visited[i]!=1)
            {   visited[i]=1;
                    q[++rear]=i;
                }
            }
        }
    }
    public static void main(String[] args) 
    {
    	// TODO Auto-generated method stub
    	Graph obj=new Graph();
    	obj.createGraph(4);
    	obj.printGraph();
    	obj.BFS(0);
    		
    }
    
}