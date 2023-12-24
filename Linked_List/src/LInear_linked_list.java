import java.util.*;
public class LInear_linked_list {

	Node root=null;	
	void insert_left(int data) 
	{
		Node n=new Node(data);
		if(root==null) 
		{
			root=n;
			System.out.println(data+" Inserted");
		}
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
	

	public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        LInear_linked_list obj=new LInear_linked_list();
        int choice;
        do
        {
            System.out.println("\n1.insert_left\n2.insert_right\n3.delete_left\n4.delete_right\n5.Search\n6.Print_list");
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
