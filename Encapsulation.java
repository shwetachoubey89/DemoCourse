public class Encapsulation {
    public static void main(String[] args) {
        Human hum = new Human();
        hum.setAge(100);
        hum.setName("Shweta");

        System.out.println(hum.getAge() + " " + hum.getName());
    }
}

class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int i) {
        age = i;
    }

    public void setName(String na) {
        name = na;
    }
}