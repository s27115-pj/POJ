package zad_01;

public class Main   {
    public static void main(String[] args) {
        System.out.println("Usuwanie przy pomocy innej listy ");
        Zad_01 zad_01 = new Zad_01();
        zad_01.fillList();
        zad_01.addTeaToRemove();
        zad_01.removeUseList(zad_01.removeTea);
        System.out.println("____________________________________________________________________________________________");
        System.out.println("Usuwanie przy pomocy indexu");
        zad_01 = new Zad_01();
        zad_01.fillList();
        zad_01.removeByIndex(2);
        System.out.println("____________________________________________________________________________________________");
        System.out.println("Usuwanie pierwszego wystąpienia"); //moża też usunąć ostatnie
        zad_01 = new Zad_01();
        zad_01.fillList();
        System.out.println("Przed usunięciem ");
        System.out.println(zad_01.teaType.toString());
        System.out.println("Elementy do usunięcia ");
        System.out.println("Yellow Tea");
        zad_01.teaType.removeFirstOccurrence("Yellow Tea");
        System.out.println("Po usunięciu");
        System.out.println(zad_01.teaType.toString());
        System.out.println("____________________________________________________________________________________________");
        System.out.println("Usuwanie pierwszego i ostatniego elementu");
        zad_01 = new Zad_01();
        zad_01.fillList();
        zad_01.removeFirstAndLast();
        System.out.println("____________________________________________________________________________________________");
    }
}