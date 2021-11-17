package sorting;

/**
 * @author <Fayome Minett>
 */
public class BubbleSort extends SorterBase 
{
	@SuppressWarnings("rawtypes")
	@Override
	public void sort( Comparable[] target)
	{
		int n = target.length;
	
		
		for(int i = 0; i < n-1; i++)

			for(int j = 0; j < n-i-1; j++)
		
				if(!(less(target[j], target[j+1])))
				{
					Comparable temp = target[j];
					target[j] = target[j+1];
					target[j+1] = temp;
					}
		
				}
	    
	void printTarget(int target[])
{
    int n = target.length;
    for (int i=0; i<n; ++i)
        System.out.print(target[i] + " ");
    System.out.println();
}
}


	                        
