import java.util.Scanner;

public class Sliding_Window {

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
	void sliding_window(int size)
    {
        if((rear-front+1)<size)
        {
            int max=queue[front];//ref
            for(int i=front+1;i<=rear;i++)
                if(queue[i]>max)
                    max=queue[i];
            System.out.println("Max is window :"+max);
        }
        else
        {
          System.out.println("Max is window :"); 
          for(int i=front;i<=rear-size+1;i++)
          {
              int max=queue[i];
              for(int j=i+1;j<=i+size-1;j++)
              {
                  if(queue[j]>max)
                      max=queue[j];
              }
              System.out.print(max); 
          }
    }
    }
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Size Of queue");
        int size=Sc.nextInt();
        Sliding_Window obj=new Sliding_Window();
        obj.createQueue(size);      
        int choice;
        do
        {
            System.out.println("\n1.enqueue\n2.dequeue\n4.run_sliding_window");
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
                case 4 :
                	if(!obj.is_empty()) 
                	{
                	System.out.println("Enter the Sliding Windo Number");
                	int x=Sc.nextInt();
                    obj.sliding_window(x);
                	}
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
