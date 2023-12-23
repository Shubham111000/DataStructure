import java.util.Scanner;

public class Circular_Queue {
	int front,rear,MaxSize,queue[],count;
	void createQueue(int size) 
	{
		MaxSize=size;
		queue=new int[MaxSize];
		front= 0;
		rear=-1;
		count=0;
	}
	void enqueue(int e)    //Entry On Queue
	{
		rear=(rear+1)%MaxSize;
		queue[rear]=e;
		count+=1;
	}
	boolean is_full() 
	{
		if(count==MaxSize)
			return true;
		else
			return false;
	}
	int dequeue() 
	{
		int temp=queue[front];
		front=(front+1)%MaxSize;
		count-=1;
		return temp;
	}
	boolean is_empty()
	{
		if(count==0)
			return true;
		else
			return false;
	}
	void print_queue() 
	{
		int i=front;
		int c=0;
		while(c<count) 
		{
			System.out.print(queue[i]+"-->");
			i=(i+1)%MaxSize;
			c++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Size Of queue");
        int size=Sc.nextInt();
        Circular_Queue obj=new Circular_Queue();
        obj.createQueue(size);      
        int choice;
        do
        {
            System.out.println("\n1.enqueue\n2.dequeue\n3.print_queue");
            choice=Sc.nextInt();
            switch(choice)
            {
                case 1:
                    if(!obj.is_full())
                    {
                        System.out.println("Enter the Number which you want to push");
                        int x=Sc.nextInt();
                        obj.enqueue(x);
                        System.out.println("enqued no is ="+x);
                    }
                    else
                        System.out.println("Queue is Full");
                break;
                case 2:
                    if(!obj.is_empty())
                    System.out.println("dequeued Number is ="+obj.dequeue());
                    else
                        System.out.println("queue is empty");
                break;
                case 3:
                    if(!obj.is_empty())
                        obj.print_queue();
                    else
                        System.out.println("Queue  is empty");
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
