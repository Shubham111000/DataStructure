import java.util.*;
public class Stack {

	int stack[],tos,maxsize;
	void creatstaxck(int size) 
	{
		maxsize=size;
		stack=new int[size];
		tos=-1;
	}
	void push(int data) 
	{
		if(!is_full())
		{
			stack[++tos]=data;
			System.out.println(data+" inserted");
			System.out.println();
		}
		else
			System.out.println("stack is Full\n");
	}
	void pop() 
	{
		if(!is_empty())
		{	
			int temp=stack[tos--];
			System.out.println(temp+" removed");
			System.out.println();
		}
		else
			System.out.println("stack is Empty\n");
	}
	boolean is_full() 
	{
		if(tos==maxsize-1)
			return true;
		else
			return false;
			
	}
	boolean is_empty()
	{
		if(tos==-1)
			return true;
		else
			return false;
	}
	void print_Stack() 
	{
		if(!is_empty())
		{
			for(int i=tos;i>=0;i--)
				System.out.print(stack[i]+"\t");
			System.out.println();
			System.out.println();
		}
		else
			System.out.println("stack is empty\n");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack obj=new Stack();
		obj.creatstaxck(5);
		System.out.println("Enter the number");
		obj.push(sc.nextInt());
		System.out.println("Enter the number");
		obj.push(sc.nextInt());
		System.out.println("Enter the number");
		obj.push(sc.nextInt());
		System.out.println("Enter the number");
		obj.push(sc.nextInt());
		System.out.println("Enter the number");
		obj.push(sc.nextInt());
		System.out.println("Enter the number");
		obj.push(sc.nextInt());
		obj.print_Stack();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.print_Stack();
		obj.pop();
		obj.pop();
		obj.pop();
		
	}

}
