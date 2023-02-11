import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book {
    public static void main(String[] args) {

        List<String> listBook = new ArrayList<>();

        listBook.add("Лісова пісня");
        listBook.add("Тіні забутих предків");
        listBook.add("Кайдашева сім'я");
        listBook.add("Кобзарь");
        listBook.add("Енеїда");

        Map<Integer, String> map = new HashMap<>();
        listBook.forEach((i) -> map.put(listBook.indexOf(i), i));
        System.out.println(map);
    }
}