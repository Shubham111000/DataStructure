import java.util.Scanner;

public class LinearQueue {

	int front,rear,MaxSize,queue[];
	void createQueue(int size) 
	{
		MaxSize=size;
		queue=new int[MaxSize];
		front= 0;
		rear=-1;		
	}
	void enqueue(int e)    //Entry On Queue
	{
		rear++;
		queue[rear]=e;
	}
	boolean is_full() 
	{
		if(rear==MaxSize-1)
			return true;
		else
			return false;
	}
	int dequeue() 
	{
		return queue[front++];
	}
	boolean is_empty()
	{
		if(front>rear)
			return true;
		else
			return false;
	}
	void print_queue() 
	{
		for(int i=front;i<=rear;i++)
			System.out.print(queue[i]);
	}
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Size Of queue");
        int size=Sc.nextInt();
        LinearQueue obj=new LinearQueue();
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

