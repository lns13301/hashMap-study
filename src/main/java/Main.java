package main.java;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Item> itemInfo = new HashMap<>();
        itemInfo.put(0, new Item("Pencil", "normal", 3, 0.035f, 500));
        itemInfo.put(1, new Item("Cutter knife", "normal", 10, 0.12f, 1500));
        itemInfo.put(2, new Item("Ruler", "normal", 1, 0.06f, 800));

        itemInfo.keySet().stream()
                .filter(x -> itemInfo.get(x).getPrice() > 700)
                .filter(x -> itemInfo.get(x).getWeight() < 0.1f)
                .forEach(x -> System.out.println(itemInfo.get(x).getName()));
    }
}
