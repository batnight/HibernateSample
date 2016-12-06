package model;

/**
 * Created by Mohammad on 06/12/2016.
 */
public class Student extends Person {
    private int average;

    public Student(int average,int id,String fullName) {
        super.setFullName(fullName);
        super.setId(id);
        this.average = average;
    }

    public Student() {
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }
}
