import java.util.*;

public class Sort_Stack {
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

    public static void main(String[] args) 
    {
    	
    	Sort_Stack stack=new Sort_Stack();
    	Sort_Stack Sort_stack=new Sort_Stack();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the size");
    	int size=sc.nextInt();
    	stack.createStack(size);
    	Sort_stack.createStack(size);
    	while(!stack.is_full()) 
    	{
    		System.out.println("Enter the Number");
    		stack.push(sc.nextInt());
       	}
    	stack.print_stack();
    	while (!stack.is_empty()) {
            int temp = stack.pop();
            // Pop elements from the sortedStack and push them back onto the stack
            while (!Sort_stack.is_empty() && Sort_stack.peek() > temp) {
                stack.push(Sort_stack.pop());
            }
            Sort_stack.push(temp);
        }
    	Sort_stack.print_stack();
    	    	
    	
    }
}
