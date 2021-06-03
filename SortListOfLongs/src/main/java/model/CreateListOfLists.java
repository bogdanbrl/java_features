package model;

import java.util.*;

/**
 * @author Bogdan Brl
 * @created 19/03/2021 - 2:32 PM
 * @project SortListOfLongs
 */
public class CreateListOfLists {

    private List<List<Long>> listOfLongList;

    public CreateListOfLists() {
        listOfLongList = new LinkedList<>();
        populateListOfLists();
    }

    private void populateListOfLists(){
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

        listOfLongList.add(longList1);
        listOfLongList.add(longList2);
        listOfLongList.add(longList3);
        listOfLongList.add(longList4);
    }

    public List<List<Long>> getListOfLongList() {
        return listOfLongList;
    }
}
