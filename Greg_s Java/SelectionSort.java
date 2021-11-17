package sorting;

/**
 * @author <Your Name Here>
 */
public class SelectionSort extends SorterBase
{
@SuppressWarnings("rawtypes")
@Override

public void sort(Comparable[] target)
{
	for (int i = 0; i < target.length-1;i++)
{
		int minimumIndex = i;

		for (int j = i+1; j < target.length; j++)
{
	if (less (target[j], target[minimumIndex]))
{
		minimumIndex = j;
}
}
		swap(target, i, minimumIndex);
}
}




}