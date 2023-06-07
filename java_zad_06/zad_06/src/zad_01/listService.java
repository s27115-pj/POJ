package zad_01;

import java.util.LinkedList;

public interface listService {
    void fillList();
     void addTeaToRemove();
    void removeByIndex(int index);
    void removeUseList(LinkedList<String> remove);
    void removeFirstAndLast ();
}
