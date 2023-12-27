package Tree_DLL;

public class Tree_Example {
	    DNode root;
	    void createtree()
	    {
	        root=null;
	    }
	    
	    void insert(DNode r,DNode n)//r:root n:new node
	    {
	        if(root==null)
	            root=n;
	        else
	        {
	            if(n.data<r.data)
	            {
	                if(r.left==null)
	                    r.left=n;
	                else
	                    insert(r.left,n);
	            }
	            else
	            {
	                if(r.right==null)
	                    r.right=n;
	                else
	                    insert(r.right,n);
	            }
	        }
	    }
	    void inorder(DNode r)
	    {
	        if(r!=null)
	        {
	            inorder(r.left);//l
	            System.out.print(r.data+",");//p
	            inorder(r.right);//r
	        }
	    }
	    void Preorder(DNode r)
	    {
	        if(r!=null)
	        {
	        	System.out.print(r.data+",");//p
	        	Preorder(r.left);//l
	        	Preorder(r.right);//r
	        }
	    }
	    void Postorder(DNode r)
	    {
	        if(r!=null)
	        {
	        	
	        	Postorder(r.left);//l
	        	Postorder(r.right);//r
	            System.out.print(r.data+",");//p
	        }
	    }
	    public static void main(String args[])
	    {
	        Tree_Example obj=new Tree_Example();
	        obj.createtree();//root=null
	        DNode n1=new DNode(50);
	        obj.insert(obj.root, n1);
	        DNode n2=new DNode(20);
	        obj.insert(obj.root, n2);
	        DNode n3=new DNode(60);
	        obj.insert(obj.root, n3);
	        DNode n4=new DNode(30);
	        obj.insert(obj.root, n4);
	        DNode n5=new DNode(100);
	        obj.insert(obj.root, n5);
	        obj.inorder(obj.root);
	        System.out.println();
	        obj.Preorder(obj.root);
	        System.out.println();
	        obj.Postorder(obj.root);
	        
	    }
	
}
