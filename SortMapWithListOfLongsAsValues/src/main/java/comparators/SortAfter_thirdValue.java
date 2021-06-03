package comparators;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author Bogdan Brl
 * @created 19/03/2021 - 7:15 PM
 * @project SortMapWithListOfLongsAsValues
 */
public class SortAfter_thirdValue<T extends Comparable<T>> implements Comparator<Map.Entry<Integer ,LinkedList<T>>> {

    @Override
    public int compare(Map.Entry<Integer, LinkedList<T>> o1, Map.Entry<Integer, LinkedList<T>> o2) {
        return o2.getValue().get(2).compareTo(o1.getValue().get(2));
    }
}
