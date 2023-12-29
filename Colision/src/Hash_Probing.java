import java.util.*;

public class Hash_Probing 
{
	int HashTable[],maxsize,count;
	void init(int Size) 
	{
		maxsize=Size;
		HashTable=new int[maxsize];
		count=0;
		for(int i=0;i<maxsize;i++)
			HashTable[i]=-1;
	}
	void PrinHashTable() 
	{
		for(int i=0;i<maxsize;i++)
			System.out.println("@"+i+"--------->"+HashTable[i]);
	}
	boolean isTableFull() 
	{
		if(count==maxsize)
			return true;
		else
			return false;
	}
	boolean isTableEmpty() 
	{
		if(count==0)
			return true;
		else
			return false;
	}
	void Insert(int data)
	{
		
		
			int index=data%maxsize;
			if(HashTable[index]==-1)
			{
				HashTable[index]=data;
				count++;
			}
			else 
			{
				for(int i=index;count<10;i=((i+1)%maxsize))
					if(HashTable[i]==-1)
					{
						HashTable[i]=data;
						count++;
						System.out.println(index+" is already taken so inserted at "+i);
						break;
					}
			}
		
	}		

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Hash_Probing obj=new Hash_Probing();
		System.out.println("Enter the Size of HashTable");
		obj.init(sc.nextInt());
		int ch;
		do
		{	System.out.println("1.Insert\n2.print HashTable\n0.exit");
		    ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					if(!obj.isTableFull())
					{
						System.out.println("Enter the Number");
						obj.Insert(sc.nextInt());
					}
					else
					{
						System.out.println("Table is full");
					}
					break;
				case 2:
					if(obj.isTableEmpty())
						System.out.println("Table is Empty");
					else 
						obj.PrinHashTable();
					break;
				case 0:
					System.out.println("exiting");
					break;
				default:
					System.out.println("Enter valid choice");
					break;
			}
			
		}while(ch!=0);
		
		
	}

}
