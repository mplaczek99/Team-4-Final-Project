package sorting;

/**
 * @author <Greg Scheidler>
 */
public class ShellSort extends SorterBase
{
	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] target) 
	{
		int n = target.length;
		for (int gap = n/2; gap > 0; gap/= 2)
		{
			for (int i = gap; i<n; i+=1)
			{
				Comparable temp = target[i];
				
				int j = i;
				while (j >= gap && less(temp, target[j-gap]))
				{
					swap(target, j, j-gap);
					j-= gap;
				}
				target[j] = temp;
			}
		}
	}
}