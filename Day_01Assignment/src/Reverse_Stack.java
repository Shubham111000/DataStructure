import java.util.*;

public class Reverse_Stack 
{
    int stack[],tos,MaxSize;
    void createStack(int size)
    {
        stack=new int [size];
        tos=-1;
        MaxSize=size;
    }
    void push(int e)
    {      
        tos++;
        stack[tos]=e;
        //or stack[++tos]=e;
    }
    boolean is_full()
    {
        if(tos==MaxSize-1)
            return true;
        else
            return false;            
    }
    int pop()
    {
        int a=stack[tos];
        tos--;
        return a;
        //or return stack[tos--];
    }
    boolean is_empty()
    {
        if(tos==-1)
            return true;
        else
            return false;
    }
    int peek()       //same as pop but will not change  position of tos;
    {
        return stack[tos];
    }
    void print_stack()
    {        
        for (int i=tos;i>-1;i--)
            System.out.print(stack[i]);
        System.out.println();
    }
   public static void main(String [] args) 
   {
	   Scanner sc=new Scanner(System.in);
	   Reverse_Stack stack=new Reverse_Stack();
	   Reverse_Stack reversed_stack=new Reverse_Stack();
	   System.out.println("Enter size of Stack");
	   int size=sc.nextInt();
	   stack.createStack(size);
	   reversed_stack.createStack(size);
	   while(!stack.is_full())
	   {
		   System.out.println("Enter the number ");
		   int temp=sc.nextInt();
		  // System.out.println("--");
		   stack.push(temp);
		   //
	   }
	   stack.print_stack();
	   System.out.println("------------");
	   while(!reversed_stack.is_full()) 
	   {
		   
			   int temp=stack.pop();
			   reversed_stack.push(temp);
			  
		   
	   }
	   reversed_stack.print_stack();
	   //System.out.println("--");
	   
    }

}
