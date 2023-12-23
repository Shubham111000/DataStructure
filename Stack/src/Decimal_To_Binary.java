import java.util.*;
public class Decimal_To_Binary {
	int stack[];
    int tos,MaxSize;
    
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
             System.out.println(stack[i]);
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		int num=a;
		int cnt=0;
		while(num!=0) 
		{
			num/=2;
			cnt++;
		}
		Decimal_To_Binary obj=new Decimal_To_Binary();
		obj.createStack(cnt);
		while(a>0) 
		{
			int r=a%2;
			a=a/2;
			obj.push(r);			
		}
		while(!obj.is_empty())
			System.out.print(obj.pop());
		
		
	}

}
