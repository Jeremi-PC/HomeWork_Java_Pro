package org.example;

public class Student implements Cloneable{
    private String first_name;
    private String last_name;
    private int num_groupe;



    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getNum_groupe() {
        return num_groupe;
    }

    public void setNum_groupe(int num_groupe) {
        if (num_groupe < 0) { throw new RuntimeException("Only positive data"); }
            this.num_groupe = num_groupe;
        }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public Student(String first_name, String last_name, int num_groupe) {
        this.first_name = first_name;
        this.last_name = last_name;
        setNum_groupe(num_groupe);
    }

    public void moveToNextGroupe(int num) {
        num_groupe++;
    }


}

