package sorting;

/**
 * @author <Fayome Minett>
 */
@SuppressWarnings("rawtypes")
public class MergeSort implements Sorter 
{	

	public void sort(Comparable[] target) 
	{
		mergeSort(target, target.length);
 
	}
	private void mergeSort(Comparable[] a, int n) 
	{
		if(n<2) { return;}
		int mp = n/2;  // midpoint
		 Comparable[] L = new Comparable[mp];
		 Comparable[] R = new Comparable[n - mp];
		
		for(int i = 0; i < mp; i++) 
		{
			L[i] = a[i];
		}
		
		for(int i = mp; i < n; i++) 
		{
			R[i - mp] = a[i];
		}
		mergeSort(L, mp);
		mergeSort(R, n - mp);
		
		merge(a, L, R, mp, n- mp); 
		
	}
	
private static void merge(Comparable[] a, Comparable[] L, Comparable[] R, int left, int right) 
{
		 int i = 0, j = 0, k = 0;
		 
		 while(i < left && j < right) 
		 {
			     if (L[i].compareTo(R[j]) < 0)
			     {
			    	 a[k] = L[i];
				     i++;
				     k++;
			     }
			     else
			     {
				     a[k] = R[j];
				     j++;
				     k++;
			     }
        }
		
		
		 while (i < left) {
	            a[k] = L[i];
	            i++;
	            k++;
	            
		 }
		 
		 while (j < right) 
		 {
	            a[k] = R[j];
	            j++;
	            k++;
		
	     }
}
}

	