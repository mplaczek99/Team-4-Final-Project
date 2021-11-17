package sorting;

/**
 * @author <Fayome Minett>
 */
public class SelectionSort extends SorterBase 
{
	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] target)
	{
		int n = target.length;
		
		for(int i = 0; i< n; i++) 
		{
			int m_idx = i;
			int min_idx;
			for (int j = i + 1; j < n; j++)
			if (target[j].compareTo(target[min_idx]))
					min_idx = j;
			
			if(min_idx != i) 
			{
				Comparable temp = target[i];
			    target[i] = target[min_idx];
			    target[min_idx] = temp;
			}
		}
	}
}
			
	

	