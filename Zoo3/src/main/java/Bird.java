public class Bird extends baseAnimal{

    public void fly(){
        baseAnimal.outText("Полетел");
    }

    public Bird(Integer age, String name, String say) {
        super(age, name, "Птица",  say);
    }
}
