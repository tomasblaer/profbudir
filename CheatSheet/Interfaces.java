package CheatSheet;


/*
 * Í raun bara abstract klasi sem má ekki vera með nein properties, né implemented methods,
 * gert er ráð fyrir því að öll method í interfaceinu séu abstract & public.
 */
interface Animal {
    void makeSound();

    void sleep(int hours);
}

class Pig implements Animal {
    public void makeSound() {
        System.out.println("Oink");
    }

    public void sleep(int hours) {
        System.out.println("Pig sleeps for " + hours + " hours");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }

    public void sleep(int hours) {
        System.out.println("Cat sleeps for " + hours + " hours");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Animal animal = new Pig();
        animal.makeSound();
    }

}
