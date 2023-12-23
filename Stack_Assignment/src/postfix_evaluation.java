import java.util.*;
public class postfix_evaluation {

	 int stack[], tos,MaxSize;
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
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		postfix_evaluation obj=new postfix_evaluation();
		obj.createStack(s.length());
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				obj.push(Character.getNumericValue(ch));		
			}
			else {
				int num1=obj.pop();
				int num2=obj.pop();
				switch(ch) {
				
				
				case '+':
					obj.push(num2+num1);
					break;
					
				case '-':
					obj.push(num2-num1);
					break;
					
				case '/':
					obj.push(num2/num1);
					break;
					
					
				case '*':
					obj.push(num2*num1);
					break;
					
				default:
					System.out.println("Wrong choice");
				}
				
				
			
			}
			
		
}
		System.out.println(obj.peek());
		
		}
		

	}

