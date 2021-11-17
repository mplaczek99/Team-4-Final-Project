package sorting;

/**
 * @author Michael Placzek
 */
public class InsertionSort extends SorterBase 
{
	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] target) 
	{
		int listLength = target.length;
		int firstOutOfOrder, location;
		Comparable temp;

		for (firstOutOfOrder = 1; firstOutOfOrder < listLength; firstOutOfOrder++) {
			if (target[firstOutOfOrder].compareTo(target[firstOutOfOrder - 1]) < 0) {
				temp = target[firstOutOfOrder];
				location = firstOutOfOrder;

				do {
					target[location] = target[location - 1];
					location--;
				} while (location > 0 && target[location - 1].compareTo(temp) > 0);
			}
		}
	}
}