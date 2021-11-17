package sorting;

/**
 * @author <Fayome Minett>
 */
public class InsertionSort extends SorterBase 
{
	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] target) 
	{
		   int i, j;
		   Comparable Ttester;
		   for(i = 1; i < target.length; i++) 
           {
			       Ttester = target[i];
                   j = i - 1;
	
	               while (j >= 0 && !(less(target[j], Ttester))) 
	               {
                            target[j + 1] = target[j];
                            j = j - 1;
                   }
	               target[j + 1] = Ttester;
            }
	  }
 }
		
	
