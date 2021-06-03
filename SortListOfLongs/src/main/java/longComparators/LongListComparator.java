package longComparators;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Bogdan Brl
 * @created 19/03/2021 - 3:14 PM
 * @project SortListOfLongs
 */
public class LongListComparator<T extends Comparable<T>> implements Comparator<List<T>> {

    @Override
    public int compare(List<T> o1, List<T> o2) {
        int c = o1.get(0).compareTo(o2.get(0));
        return c;
    }
}
