package org.example.university;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student("Bob", "Marley", 1245);
        Student student2 = new Student("Whitney", "Houston", 1240);

        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " " + student1.getNumGroupe());
        System.out.println(student2.getFirstName() + " " + student2.getLastName() + " " + student2.getNumGroupe());
        student1.moveToNextGroupe(student1.getNumGroupe());
        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " " + student1.getNumGroupe());

        Student student3 = student1.clone();

        System.out.println(student3.getFirstName() + " " + student3.getLastName() + " " + student3.getNumGroupe());

        boolean compareStudents = (student1 == student3);
        System.out.println(compareStudents);
        student3.setNumGroupe(1233);
        System.out.println(student3.getFirstName() + " " + student3.getLastName() + " " + student3.getNumGroupe());
    }
}


