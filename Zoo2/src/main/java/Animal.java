public class Animal {

    private Integer age;
    private String name;
    private String animalType;
    private String subType;
    private String say;

    public Integer getAge() {
        return age;
    }

    private static int rnd(int max)
    {
        return (int) (Math.random() * ++max);
    }

    public static String genAnimalSubType(){
        String[] str = {"Парнокопытные", "Приматы", "Насекомоядные", "Грызуны"};
        return str[ rnd( str.length-1) ];
    }

    public static String genBirdSubType(){
        String[] str = {"Пернатый", "Страус", "Пингвин"};
        return str[ rnd( str.length-1) ];
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", animalType='" + animalType + '\'' +
                ", subType='" + subType + '\'' +
                '}';
    }


    public Animal(String name) {
        String[] strAnimal = {"Животное", "Птица"};
        int n = rnd(1);

        this.name = name;
        this.age = rnd(30);
        this.animalType = strAnimal[n];
        if (n == 0)
          this.subType = genAnimalSubType();
        else
          this.subType = genBirdSubType();

    }

    public Animal(Integer age, String name, String animalType, String subType, String say) {
        this.age = age;
        this.name = name;
        this.animalType = animalType;
        this.subType = subType;
        this.say = say;
    }
}
