package Doubli_Linked_List;

public class Doubli_Linked_List {
	DNode root;
	void createlist()
	{
		root=null;
	}
	void insert_left(int data) 
	{
		DNode n=new DNode(data);
		if(root==null)
			root=n;
		else
		{
			n.right=root;
			root.left=n;
			root=n;
		}
		System.out.println(data+" Inserted");
	}
	void insert_right(int data) 
	{
		DNode n=new DNode(data);
		if(root==null)
			root=n;
		else
		{
			DNode t1=root;
			while(t1.right!=null)
				t1=t1.right;
			t1.right=n;
			n.left=t1;
		}
		System.out.println(data+" Inserted");
	}
	void Delete_left() 
	{
		if(root==null)
			System.out.println("List is Empty");
		else 
		{
			DNode t=root;
			if(root.right==null)
				root=null;
			else 
			{
				root=root.right;
				root.left=null;
			}
			
		}
	}
	void Delete_right() 
	{
		if(root==null)
			System.out.println("List is Empty");
		else 
		{
			DNode t1=root;
			DNode t2=t1;
			if(root.right==null)
				root=null;
			else
			{
				while(t1.right!=null) 
				{	t2=t1;
					t1=t1.right;
				}
				t2.right=null;
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
