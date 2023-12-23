import java.util.Scanner;

public class Max_Stack {
	int stack[];
    int tos,MaxSize;
    static int flag;
    
    void createStack(int size)
    {
        stack=new int[size];
        MaxSize=size;
        tos=-1;
    }
    void push(int e)
    {
        tos++;
        stack[tos]=e;
        //or stack[++tos]=e;
    }
    int pop()
    {
        int temp=stack[tos];
        tos--;
        return(temp);
    }
   
    boolean is_full()
    {
        if(tos==MaxSize-1)
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
     
     void print_stack()
     {
         for(int i=tos;i>-1;i--)
             System.out.print(stack[i]+"\n");
     }
     int peek()       //same as pop but will not change  position of tos;
     {
         return stack[tos];
     }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Size Of Stack");		
		int size=sc.nextInt();
		Max_Stack stack=new Max_Stack();
		Max_Stack max_stack=new Max_Stack();
		max_stack.createStack(size);
		stack.createStack(size);
		
		 int choice;
	        do
	        {
	            System.out.println("\n1.push\n2.pop\n3.peek\n4.print_stack");
	            choice=sc.nextInt();
	            switch(choice)
	            {
	            	
	                case 1:
	                	if(max_stack.is_empty())
	            			flag=0;
	                    if(!stack.is_full())
	                    {
	                    	
	                    	System.out.println("Enter the number");
	            			int num=sc.nextInt();
	                        if(flag==0)
	            			{
	            			stack.push(num);
	            			max_stack.push(num);
	            			System.out.println("Number pushed in both stack "+num);
	            			flag=1;
	            			}
	            			else 
	            			{
	            				stack.push(num);
	            				System.out.println("Number pushed in stack "+num);
	            				if(num>max_stack.peek()) 
	            				{
	            					max_stack.push(num);
	            					System.out.println("Number pushed in max_stack "+num);
	            					
	            				}
	            				
	            			}	
	                       
	                    }
	                    else
	                        System.out.println("Stack OverFlow");
	                break;
	                case 2:
	                    if(!stack.is_empty()) 
	                    {
	                    	if(stack.peek()==max_stack.peek())
	                    	{	stack.pop();
	                    		System.out.println("Number = "+max_stack.pop()+"is popped from both stack");
	                    	}
	                    	else
	                    		System.out.println("Number = "+stack.pop()+"is popped from  stack");
	                    		
	                    }
	                    else
	                        System.out.println("Stack UnderFlow");
	                break;
	                case 3:
	                    if(!stack.is_empty())
	                        System.out.println("Number is = "+stack.peek());
	                    if(!max_stack.is_empty())
	                        System.out.println("Number is = "+max_stack.peek());
	                    else
	                        System.out.println("Stack is Empty");
	                break;
	                case 4:
	                    if(!stack.is_empty())
	                        stack.print_stack();
	                    System.out.println("-----------------------------------");
	                    if(!max_stack.is_empty())
	                    	max_stack.print_stack();
	                    else
	                        System.out.println("Stack is Empty");
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

	 
		for (int i=1;i<=size;i++) 
		{
			
					
		}
		stack.print_stack();
		System.out.println("-----------------------------");
		max_stack.print_stack();
		

	}

}
