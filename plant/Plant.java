package org.example.plant;

public class Plant {

    private Type type;

    public Car produceTruck() {
        Car car1 = new Car();
        car1.type = Type.TRUCK;
        car1.power = 350;
        car1.setModal("Actros");
        car1.setMake("Mercedes");
        System.out.println("Type: "+car1.type + " Power: " + car1.power + " Modal: " + car1.getModal() + " Make: " + car1.getMake());
        return car1;
    }

    public Car produceCar() {
        Car car2 = new Car();
        car2.type = Type.CAR;
        car2.power = 150;
        car2.setModal("klasse A");
        car2.setMake("Mercedes");
        System.out.println("Type: "+car2.type + " Power: " + car2.power + " Modal: " + car2.getModal() + " Make: " + car2.getMake());
        return car2;
    }


    public Car produceSportcar() {
        Car car3 = new Car();
        car3.type = Type.SPORTCAR;
        car3.power = 300;
        car3.setModal("AMG63");
        car3.setMake("Mercedes");
        System.out.println("Type: "+car3.type + " Power: " + car3.power + " Modal: " + car3.getModal() + " Make: " + car3.getMake());
        return car3;

    }

}





