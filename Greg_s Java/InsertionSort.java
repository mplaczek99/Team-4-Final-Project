package sorting;

/**
 * @author <Your Name Here>
 */

public class InsertionSort extends SorterBase 
{
	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] target) 
	{
		int i;
		int j;
		int n = target.length;
	
		for (i = 1; i < n; i++)
		{
			for (j = i; j > 0 && less(target[j],target[j-1]); j--)
			{
			swap(target, j, j-1);
			}
		}
	}
}
