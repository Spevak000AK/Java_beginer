import java.util.ArrayList;
import java.util.List;

public class zoo {

    private static int rnd(int max)
    {
        return (int) (Math.random() * ++max);
    }

    // Генератор зоопарка
    public static void genZoo(List<baseAnimal> list, Integer count){
        for (int i = 0; i < count; i++){
           //Чётное животное, не чётное птица
           if (rnd(1) % 2 == 0){
               list.add(new Animal(rnd(30), "Животное №"+String.valueOf(i), "Крик животного №"+String.valueOf(i) ) );
           }else {
               list.add(new Bird(rnd(30), "Птица №"+String.valueOf(i), "Крик птицы №"+String.valueOf(i) ) );
           }
        }
    }

    public static void setZoo(List<baseAnimal> list){
        list.add(new Animal(5, "Медведь", "Рык медведя р-р-р-р-р-р-р!" ) );
        list.add(new Animal(4, "Волк", "Вой волка у-у-у-у-у-у" ) );
        list.add(new Animal(2, "Осёл", "иа-иа-иа-иа" ) );

        list.add(new Bird(7, "Воробей", "чик-чирик" ) );
        list.add(new Bird(8, "Гусь", "Га-га-га" ) );
        list.add(new Bird(8, "Перделка", "пыр-пыр-пыр" ) );

    }


    public static void main(String[] args) {
        List<baseAnimal> zooList = new ArrayList<baseAnimal>();

        //genZoo(zooList, 5);
        setZoo(zooList);

        for (int i=0; i< zooList.size(); i++){
            baseAnimal ref = zooList.get(i);

            System.out.println(zooList.get(i).toString() );
            if (ref instanceof Animal)
                ((Animal) ref).run();
            else if (ref instanceof Bird)
                ((Bird) ref).fly();

        }





    }

}
