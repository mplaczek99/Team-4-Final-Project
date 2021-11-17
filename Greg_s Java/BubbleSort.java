package sorting;

/**
 * @author <Greg Scheidler>
 */
public class BubbleSort extends SorterBase
{
public void sort(Comparable[] target)
{
    int i, j;
    int n = target.length;
    for (i = 0; i < n; i ++)    
    {
    
    	for (j = 1; j < (n-i); j ++)
    {
    		if (less(target[j], target[j-1]))
        {
            swap(target, j-1, j);
        }
}
}
}
}