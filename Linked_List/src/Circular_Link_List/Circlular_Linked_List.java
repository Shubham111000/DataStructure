package Circular_Link_List;

import java.util.Scanner;

import Linear_linked_list.Node;

public class Circlular_Linked_List {
	Node root,last;
	void createList() 
	{
		root=last=null;		
	}
	void insert_left(int data) 
	{
		Node n=new Node(data);
		if(root==null) 
		{
			root=last=n;
			last.next=root;
		}
		else 
		{
			n.next=root;
			root=n;
			last.next=root;
		}
		System.out.println(data+" Inserted");
	}
	void insert_right(int data) 
	{
		Node n=new Node(data);
		if(root==null) 
		{
			root=last=n;
			last.next=root;
		}
		else 
		{
			last.next=n;
			last=n;
			last.next=root;
		}
	}
	void delete_left() 
	{
		if(root==null) 
			System.out.println("List Is Empty");	
		else 
		{
			Node t=root;
			if(root==last) 
				root=last=null;
			else 
			{
				root=root.next;
				last.next=root;
			}
			System.out.println(t.data+" Deleted");
		}
		
	}
	void delete_right() 
	{
		if(root==null) 
		  System.out.println("List Is Empty");	
		else 
		{
			Node t1=root;
			Node t2=t1;
			while(t1!=last) 
			{
				t2=t1;
				t1=t1.next;
				if(root==last)
					root=last=null;
				else
				{
					t2.next=root;
					last=t2;
				}
			}
			System.out.println(t1.data+" Deleted");
		}
		
	}
	void search(int key) 
	{
		if(root==null)
			System.out.println("List is Empty");
		else 
		{
			Node t=root;
			do 
			{
				if(t.data==key) 
				{
					System.out.println(key+" Found in the list");
					break;
				}
				else
				{
					t=t.next;
				}
				
			}while(t!=root );
				
		}
	}
	void print_list() 
	{
		if(root==null)
			System.out.println("List is Empty");
		else
		{
			Node t=root;
			do 
			{
				System.out.print("| "+t.data+" |->");
				t=t.next;
			}
			while(t!=root);
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		Circlular_Linked_List obj=new Circlular_Linked_List();
        obj.createList();
        int choice;
        do
        {
            System.out.println("\n1.insert_left\n2.insert_right\n3.delete_left\n4.delete_right\n5.Search\n6.Print_list\n0.Exit\n:");
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
               /* case 7:
                    System.out.println("\nEnter a number to delete:");
                    obj.deleteKey(Sc.nextInt());
                    break;
            case 8:
                    System.out.println("\nEnter index and data to insert:");
                    int index=Sc.nextInt();
                    obj.insertAt(index,Sc.nextInt());
                    break;
                    */
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
