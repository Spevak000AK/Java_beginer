import java.util.*;

public class zoo {

    public static void main(String[] args) {
        // Клички животных в зоопарке
        String[] names = {"Марс", "Пумба", "Кеша", "Пупсик", "Мадонна", "Маришка", "Капитошка", "Малый"};

        List<Animal> zooList = new ArrayList<Animal>();

        for (int i=0; i<names.length-1; i++) {
            zooList.add(new Animal( names[i] ));
        }

        zooList.forEach(System.out::println);

    }

}
