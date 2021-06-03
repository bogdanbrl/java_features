package model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Bogdan Brl
 * @created 19/03/2021 - 6:56 PM
 * @project SortMapWithListOfLongsAsValues
 */
public class CreateMapWithListOfLongsAsValues {

    private Map<Integer, LinkedList<Long>> mapWithListOfLongsAsValues;

    public CreateMapWithListOfLongsAsValues() {
        this.mapWithListOfLongsAsValues = new HashMap<>();
        populateMap();
    }

    public Map<Integer, LinkedList<Long>> getMapWithListOfLongsAsValues() {
        return mapWithListOfLongsAsValues;
    }

    private void populateMap(){
        List<Long> longList1 = new LinkedList<>();
        longList1.add(16l);
        longList1.add(34l);
        longList1.add(2l);
        longList1.add(87l);
        longList1.add(98l);

        List<Long> longList2 = new LinkedList<>();
        longList2.add(61l);
        longList2.add(43l);
        longList2.add(28l);
        longList2.add(78l);
        longList2.add(89l);

        List<Long> longList3 = new LinkedList<>();
        longList3.add(166l);
        longList3.add(344l);
        longList3.add(23l);
        longList3.add(827l);
        longList3.add(958l);

        List<Long> longList4 = new LinkedList<>();
        longList4.add(43l);
        longList4.add(12l);
        longList4.add(980l);
        longList4.add(64l);
        longList4.add(235l);

        mapWithListOfLongsAsValues.put(1, (LinkedList<Long>) longList1);
        mapWithListOfLongsAsValues.put(2, (LinkedList<Long>) longList2);
        mapWithListOfLongsAsValues.put(3, (LinkedList<Long>) longList3);
        mapWithListOfLongsAsValues.put(4, (LinkedList<Long>) longList4);

    }
}
