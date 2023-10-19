package org.example.university;

public class Student implements Cloneable {
    private String firstName;
    private String lastName;
    private int numGroupe;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumGroupe() {
        return numGroupe;
    }

    public void setNumGroupe(int numGroupe) {
        if (numGroupe < 0) {
            throw new RuntimeException("Only positive data");
        }
        this.numGroupe = numGroupe;
    }

    public Student clone() throws CloneNotSupportedException{
        return (Student) super.clone();
    }

    public Student(String first_name, String last_name, int num_groupe) {
        this.firstName = first_name;
        this.lastName = last_name;
        setNumGroupe(num_groupe);
    }

    public void moveToNextGroupe(int num) {
        numGroupe++;
    }


}

