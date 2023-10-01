package org.example;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Bob", "Marley", 1245);
        Student student2 = new Student("Whitney", "Houston", 1240);

        System.out.println(student1.getFirst_name() + " " + student1.getLast_name() + " " + student1.getNum_groupe());
        System.out.println(student2.getFirst_name() + " " + student2.getLast_name() + " " + student2.getNum_groupe());
        student1.moveToNextGroupe(student1.getNum_groupe());
        System.out.println(student1.getFirst_name() + " " + student1.getLast_name() + " " + student1.getNum_groupe());

        Student student3 = null;
        try {
            student3 = (Student) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(student3.getFirst_name() + " " + student3.getLast_name() + " " + student3.getNum_groupe());

        boolean compareStudents = (student1 == student3);
        System.out.println(compareStudents);
        student3.setNum_groupe(1233);
        System.out.println(student3.getFirst_name() + " " + student3.getLast_name() + " " + student3.getNum_groupe());
    }

}


