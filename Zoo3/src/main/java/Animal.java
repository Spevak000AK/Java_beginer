public class Animal extends baseAnimal {

    public void run(){
       baseAnimal.outText("Побежал");
    }

    public Animal(Integer age, String name, String say) {
        super(age, name, "Животное",  say);
    }
}
