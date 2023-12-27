package Tree_DLL;

public class DNode {
	
	    int data;
	    DNode left;
	    DNode right; //self reference
	    DNode(int data)
	    {
	        this.data=data;
	        this.left=this.right=null;//address of other Node
	    }
	      
	
}
