package week2;

public class Person {
    private String name;
    private int age;
    private Person[] children;
    private int childrenNumber;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.children = new Person[3];
        this.childrenNumber = 0;
    }

    // Setter and getter method
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    // toString method
    public String toString() {
        String selfIntro = "My name is " + this.name + " and my age is " + this.age + "-year-old. ";
        String childrenIntro = "";
        for (int i = 0; i < childrenNumber; ++i) {
            childrenIntro += "\tChild name is " + children[i].name + "and age is" + children[i].age + "-year-old. \n";
        }
        return selfIntro + '\n' + childrenIntro;
    }

    public void adopt(Person child) {
        if (childrenNumber >= 3) {
            System.out.println("You already have too many children. ");
            return;
        }
        children[childrenNumber] = child;
        ++childrenNumber;
    }

}
