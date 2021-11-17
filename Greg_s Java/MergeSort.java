package sorting;

/**
 * @author <Your Name Here>
 */
@SuppressWarnings("rawtypes")
public class MergeSort implements Sorter 
{	
	
	public void sort(Comparable[] target) 
	{
		mergeSort(target, target.length);
 
	}
	private void mergeSort(Comparable[] array, int len) 
	{
		if(len<2) { return;}
		int middle = len/2; 
		 Comparable[] L = new Comparable[middle];
		 Comparable[] R = new Comparable[len];
		
		for(int i = 0; i < middle; i++) 
		{
			L[i] = array[i];
		}
		
		for(int i = middle; i < len; i++) 
		{
			R[i - middle] = array[i];
		}
		mergeSort(L, middle);
		mergeSort(R, len - middle);
		
		merge(array, L, R, middle, len- middle); 
		
	}
	
private static void merge(Comparable[] a, Comparable[] L, Comparable[] R, int left, int right) 
{
		 int x = 0, y = 0, z = 0;
		 
		 while(x < left && y < right) 
		 {
			     if (L[x].compareTo(R[y]) < 0)
			     {
			    	 a[z] = L[x];
				     x++;
				     z++;
			     }
			     else
			     {
				     a[z] = R[y];
				     y++;
				     z++;
			     }
        }
		
		
		 while (x < left) {
	            a[z] = L[x];
	            x++;
	            z++;
	            
		 }
		 
		 while (y < right) 
		 {
	            a[z] = R[y];
	            y++;
	            z++;
		
	     }
}
}
