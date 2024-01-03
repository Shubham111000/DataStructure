
public class Sort {
	void Bubble_sort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++) 
		{
			boolean flag=true;
			for(int j=0;j<arr.length-1-i;j++) 
			{
				if(arr[j]>arr[j+1])
				{	
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
					flag=false;
				}
			}
			if(flag) 
			{
				System.out.println("Array is Sorted in "+(i+1)+" passes");
				break;
			}
				
		}
	}
	void print(int arr[]) 
	{
		System.out.println("Array Has");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+",");
	}
	void Selection_Sort(int arr[])
	{
		for (int i=0;i<arr.length-1;i++) 
		{
			for(int j=i+1;j<arr.length-1;j++) 
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
	}
	void Insertion_Sort(int arr[]) 
	{
		
	}

}
