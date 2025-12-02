package Midterm25;

class Person implements Comparable<Person> {
    public int birthYear;
    public int birthMonth;
    public int birthDay;

    public Person(int birthYear, int birthMonth, int birthDay) {

    }

    public int compareTo(Person person) {
        if (this.birthYear > person.birthYear) {
            return 1;
        } else if (this.birthYear < person.birthYear) {
            return -1;
        }

        if (this.birthMonth > person.birthMonth) {
            return 1;
        } else if (this.birthMonth < person.birthMonth) {
            return -1;
        }

        if (this.birthDay > person.birthDay) {
            return 1;
        } else if (this.birthDay < person.birthDay) {
            return -1;
        }

        return 0;
    }

}

public class ImplInterfaces {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.compareTo(person2);

    }
}
