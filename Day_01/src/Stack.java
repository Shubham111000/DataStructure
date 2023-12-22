import java.util.*;

public class Stack
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
        while(tos==-1)
        {
            System.out.println(stack[tos--]);
        }
        /*
        for (int i=tos;tos>-1;tos--)
            System.out.println(stack[i]);
        */
    }
    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Size Of Stack");
        int size=Sc.nextInt();
        Stack obj=new Stack();
        obj.createStack(size);
        int choice;
        do
        {
            System.out.println("\n1.push\n2.pop\n3.peek\n4.print_stack");
            choice=Sc.nextInt();
            switch(choice)
            {
                case 1:
                    if(!obj.is_full())
                    {
                        System.out.println("Enter the Number which you want to push");
                        int x=Sc.nextInt();
                        obj.push(x);
                        System.out.println("Pushed no is ="+x);
                    }
                    else
                        System.out.println("Stack OverFlow");
                break;
                case 2:
                    if(!obj.is_empty())
                    System.out.println("Poped Number is ="+obj.pop());
                    else
                        System.out.println("Stack UnderFlow");
                break;
                case 3:
                    if(!obj.is_empty())
                        System.out.println("Number is ="+obj.peek());
                    else
                        System.out.println("Stack UnderFlow");
                break;
                case 4:
                    if(!obj.is_empty())
                        obj.print_stack();
                    else
                        System.out.println("Stack UnderFlow");
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