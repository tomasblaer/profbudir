package Example25;

class Person {
    public final String kennitala;
    private String name;

    public Person(String kennitala) {
        this.kennitala = kennitala;
        this.name = "";
    }

    public String getKennitala() {
        return this.kennitala;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Classes {
    public static void main(String[] args) {
        Person person = new Person("123334");
        person.setName("Charles");

        System.out.println(person.getKennitala());
    }
}
