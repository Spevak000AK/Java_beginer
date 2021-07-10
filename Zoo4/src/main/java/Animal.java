public class Animal extends baseAnimal {

    String prefix() {
        return "Животное ";
    }

    public void run() {
        baseAnimal.outText("Побежал");
    }

    public Animal(Integer age, String name, String say) {
        super(age, name, "Животное", say);
    }


}

