
public class Sorting {
	
	
	public static void main(String[] args)
	{
		int arr[]= {66,11,33,99,88,22,44,55,77};
		int arr2[]= {11,22,33,44,55,66,77,88,99};
		Sort obj=new Sort();
		obj.print(arr);
		System.out.println();
		obj.Selection_Sort(arr);
		obj.print(arr);
	}

}
