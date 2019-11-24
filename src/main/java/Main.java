package main.java;

public class Main {
    public static void main(String[] args) {
        Item pencil = new Item("Pencil", "normal", 3, 0.025f, 500);
        Item cutterKnife = new Item("Cutter knife", "normal", 10, 0.12f, 1500);

        System.out.println(pencil.getName() + "의 가격은 " + pencil.getPrice() + "G");
    }
}
