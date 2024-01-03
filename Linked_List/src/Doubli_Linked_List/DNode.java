package Doubli_Linked_List;


public class DNode {
	

	public int data;
    public DNode left;
    public DNode right; //self reference
    public DNode(int data)
    {
        this.data=data;
        this.left=this.right=null;//address of other Node
    }
	

}
