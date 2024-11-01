package week2;

public class Student extends Person {

    private double GPA;

    public Student(String name, int age) {
        super(name, age);
        this.GPA = 4.0;
    }

    // Getter and setter methods
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getGPA() {
        return this.GPA;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + "\nMy GPA is: " + this.GPA + ". ";
    }

}
