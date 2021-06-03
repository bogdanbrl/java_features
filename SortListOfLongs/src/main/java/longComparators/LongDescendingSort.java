package longComparators;

import java.util.Comparator;

/**
 * @author Bogdan Brl
 * @created 19/03/2021 - 2:53 PM
 * @project SortListOfLongs
 */
public class LongDescendingSort implements Comparator<Long> {
    @Override
    public int compare(Long l1, Long l2) {
        return (int) (l2 -l1);
    }
}
