package zad_01;

import java.util. LinkedList;
public class Zad_01 implements listService {

    LinkedList<String> teaType = new LinkedList<String>();
    LinkedList<String> removeTea = new LinkedList<>();
    public void fillList() {
        teaType.add("early gray");
        teaType.add("Green Tea");
        teaType.add("Oolong Tea");
        teaType.add("White tea");
        teaType.add("Pu-erh");
        teaType.add("Yellow Tea");
        teaType.add("Herbai Tea");
    }

    public Zad_01() {
    }

    public void addTeaToRemove(){
        removeTea.add("Pu-erh");
        removeTea.add("Yellow Tea");
        removeTea.add("Herbai Tea");
    }


    public void removeByIndex(int index){
        System.out.println("Lista przed usunięciem: "+teaType.toString());
        System.out.println("Elementy do usunięcia: " +  teaType.get(index));
        teaType.remove(index);
        System.out.println("Lista po usunięciu: "+teaType.toString());

    }

    public void removeUseList(LinkedList<String> remove){
        System.out.println("Lista przed usunięciem: " + teaType.toString());
        System.out.println("Elementy do usunięcia: " + remove.toString());
        teaType.removeAll(remove);
        System.out.println("Lista po usunięciu: ");
    }

    public void removeFirstAndLast (){
        System.out.println("Przed usunięciem ");
        System.out.println(teaType.toString());
        System.out.println("Elementy do usunięcia ");
        System.out.println(teaType.getFirst() +", " + teaType.getLast());
        teaType.removeFirst();
        teaType.removeLast();
        System.out.println("Po usunięciu");
        System.out.println(teaType.toString());
    }

}
