import java.util.*;
public class LInear_linked_list {

	Node root;
	void createList()
    {
        root=null;//root is never created but assigned as per need
        //the 1st node is called root
    }
	void insert_left(int data) 
	{
		Node n=new Node(data);
		if(root==null) 
		{
			root=n;
			System.out.println(data+" Inserted");
		}
		else
        {
            n.next=root;//1
            root=n;//2
        }
        System.out.println(data+" Inserted");
	}
	void delete_left() 
	{
		if(root==null) 
			System.out.println("List is Empty");
		else 
		{
			Node t=root;
			root=root.next;
			System.out.println(t.data+" Deleted");
		}
	}
	void insert_right(int data) 
	{
		Node n=new Node(data);
		if(root==null) 
		{
			root=n;
			System.out.println(data+" Deleted");
		}
		else
		{
			Node t=root;
			while(t.next!=null)
				t=t.next;
			t.next=n;
			System.out.println(data+" Inserted");
		}
		
	}
	void delete_right() 
	{
		if(root==null) 
			System.out.println("List is Empty");
		else 
		{
			Node t1=root;
			Node t2=t1;
			while(t1.next!=null) 
			{
				t2=t1;
				t1=t1.next;				
			}
			if(root==t1)
				root=null;
			else
				t2.next=null;
			System.out.println(t1.data+" Deleted");
		}
		
	}
	void print_list() 
	{
		if(root==null)
			System.out.println("List is Empty");
		else
		{
			Node t=root;
			while(t!=null) 
			{
				System.out.print("| "+t.data+" |->");
				t=t.next;
			}
		}
		
	}
	void search(int key) 
	{
		if(root==null)
			System.out.println("List is Empty");
		else 
		{
			Node t=root;
			while(t!=null && key!=t.data)
				t=t.next;
			if(t==null)
				System.out.println("Key not Found in List");
			else
				System.out.println("Key FOund in List");
		}
	}
	void deleteKey(int key)
	{  if(root==null)
	            System.out.println("Empty List");       
	   else//not empty
	   {   
	       Node t=root;Node t2=root;
	       while(t!=null && key!=t.data)
	       {
	        t2=t;       
	        t=t.next;
	       }
	       if(t==null)//not found
	               System.out.println(key+" not found in list");
	       else//found
	       {
	           System.out.println(key+" found in list");
	           if(t==root)//case1:left most
	            root=root.next;
	           else if(t.next==null)//case 2:right most
	             t2.next=null;
	           else//case 3:in between
	             t2.next=t.next;
	           System.out.println(t.data+" deleted");     
	       }
	           
	    }
	   }
	    

	void insertAt(int index,int e)
	    {  
	        if(index==0)
	        {
	            Node n=new Node(e);
	            if(root==null)
	                root=n;
	            else
	            {
	                n.next=root;
	                root=n;
	            }
	        }
	        else{
	            Node t=root;
	            Node t2=root;
	            while(t!=null && index>0)
	            {
	                t2=t;
	                t=t.next;
	                index--;
	            }
	            if(t==null)
	                System.out.println("index out of range");
	            else
	            {
	                Node n=new Node(e);
	                t2.next=n;//1
	                n.next=t;//2
	                System.out.println("iserted:");
	            }
	                
	        }
	    }

	public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        LInear_linked_list obj=new LInear_linked_list();
        obj.createList();
        int choice;
        do
        {
            System.out.println("\n1.insert_left\n2.insert_right\n3.delete_left\n4.delete_right\n5.Search\n6.Print_list\n7.Delete on Key\n8.Insert at\n0.Exit\\n:");
            choice=Sc.nextInt();
            switch(choice)
            {
                case 1:
                	System.out.println("Enter the Number");
                    obj.insert_left(Sc.nextInt());
                break;
                case 2:
                	System.out.println("Enter the Number");
                    obj.insert_right(Sc.nextInt());
                break;
                case 3:
                    obj.delete_left();
                break;
                case 4:
                    obj.delete_right();
                break;
                case 5:
                	System.out.println("Enter the key");
                    obj.search(Sc.nextInt());
                break;
                case 6:
                	obj.print_list();
                break; 
                case 7:
                    System.out.println("\nEnter a number to delete:");
                    obj.deleteKey(Sc.nextInt());
                    break;
            case 8:
                    System.out.println("\nEnter index and data to insert:");
                    int index=Sc.nextInt();
                    obj.insertAt(index,Sc.nextInt());
                    break;
                default:
                    System.out.println("Enter Valid Choice");
                break;
                case 0:
                    System.out.println("Exiting");
                break;

            }
        }
        while(choice!=0);

    }

}
