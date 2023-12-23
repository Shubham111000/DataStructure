import java.util.Scanner;

public class Priority_Queue {
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
		//sort data in order as per need:
	    for(int i=front;i<rear;i++)//passes :bubble sort
	    {
	    	for(int j=front;j<rear;j++)//sort
	           {
	               if(queue[j]>queue[j+1])
	               {
	                   int temp=queue[j];
	                   queue[j]=queue[j+1];
	                   queue[j+1]=temp;
	               }
	               
	           }
	    }
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
			System.out.print(queue[i]+"\t");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Size Of queue");
        int size=Sc.nextInt();
        Priority_Queue obj=new Priority_Queue();
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
