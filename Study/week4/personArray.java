package week4;

import week2.Person;

public class personArray {
    private Person[] people = new Person[4];

    public void init() {
        people[0] = new Person("Lucas", 23);
        people[1] = new Person("Jeffry", 23);
        people[2] = new Person("Tim", 1);
        people[3] = new Person("Tom", 8);
    }

    public int getTotalAge() {
        int totalAge = 0;
        for (int i = 0; i < 4; ++i) {
            totalAge += people[i].getAge();
        }
        return totalAge;
    }
}
