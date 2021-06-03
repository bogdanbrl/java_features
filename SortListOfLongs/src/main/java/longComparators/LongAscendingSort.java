package longComparators;

import java.util.Comparator;

/**
 * @author Bogdan Brl
 * @created 19/03/2021 - 2:52 PM
 * @project SortListOfLongs
 */
public class LongAscendingSort implements Comparator<Long> {
    @Override
    public int compare(Long l1, Long l2) {
        return (int) (l1 - l2);
    }
}
