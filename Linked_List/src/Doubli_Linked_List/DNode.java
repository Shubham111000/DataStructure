package Doubli_Linked_List;


public class DNode {
	

	public int data;
    DNode left;
    DNode right; //self reference
    DNode(int data)
    {
        this.data=data;
        this.left=this.right=null;//address of other Node
    }
	

}
