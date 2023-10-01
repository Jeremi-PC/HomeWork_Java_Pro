package org.example;

public class Cars {

    public Type type;
    int power;
    private String make;
    private String modal;

    public String getMake() {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModal()
    {
        return modal;
    }

    public void setModal(String modal)
    {
        this.modal = modal;
    }

    public Cars()
    {
        this.make = "Mercedes";
    }


}
