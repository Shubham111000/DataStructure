

public class Sort
{
	public static void PrintArray(int arr[]) 
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		System.out.println();
	}
	public static void BubbleSort(int arr[]) 
	{
		for (int i=0;i<arr.length-1;i++) 
		{
			boolean flag=true;
			for(int j=0;j<arr.length-1-i;j++) 
			{
				
				if(arr[j]>arr[j+1]) 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=false;
				}
				
			}
			if(flag) 
			{
				System.out.println("Array is sorted in "+(i+1)+" passes");
				break;
			}
		}
	}
	public static void SelectionSort(int arr[]) 
	{
		for(int i=0;i<arr.length-1;i++) 
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
	public static void InsertionSort(int arr[]) 
	{
		for(int i=0;i<arr.length-1;i++) 
		{
			int new_element=arr[i+1];
			int j=i+1;
			while(j>0&&arr[j-1]>new_element) 
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=new_element;
		}
	}
	public static void MergeSort(int arr[],int start ,int end)
	{
		if(start<end) 
		{
			int mid=(start+end)/2;
			MergeSort(arr, start, mid);
			MergeSort(arr, mid+1, end);
			Merger(arr,start,mid,end);
		}
		
		
	}
	public static void Merger(int arr[],int start,int mid,int end) 
	{
		int temp[]=new int[arr.length];
		int i,j,tindex;
		i=start;
		j=mid+1;
		tindex=start;
		while(i<=mid && j<=end) 
		{
			if(arr[i]<arr[j])
				temp[tindex++]=arr[i++];
			else
				temp[tindex++]=arr[j++];			
		}
		while(i<=mid)
			temp[tindex++]=arr[i++];
		while(j<=end)
			temp[tindex++]=arr[j++];
		for(i=start;i<=end;i++)
			arr[i]=temp[i];
	}

}

