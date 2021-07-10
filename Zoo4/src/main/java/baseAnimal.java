
public abstract class baseAnimal {
    private Integer age;
    private String name;
    private String animalType;
    private String say;

    abstract String prefix();

    public static void outText(String text) {
        System.out.println(text);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    @Override
    public String toString() {
        return prefix() + "{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", animalType='" + animalType + '\'' +
                ", say='" + say + '\'' +
                '}';
    }

    public baseAnimal(Integer age, String name, String animalType, String say) {
        this.age = age;
        this.name = name;
        this.animalType = animalType;
        this.say = say;
    }

}
