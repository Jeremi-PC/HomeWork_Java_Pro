package org.example;

public class Plant {

    private Type type;

    public void ProducingLKW(Type type) {
        if (type == Type.LKW) {
            Cars car1 = new Cars();
            {
                car1.type = type;
                car1.power = 350;
                car1.setModal("Actros");
            }
            System.out.print(car1.type + " ");
            System.out.print(car1.power + "hp ");
            System.out.print(" " + car1.getMake());
            System.out.println(" " + car1.getModal());
        }
    }

    public void ProducingPKW(Type type) {
        if (type == Type.PKW) {
            Cars car2 = new Cars();
            {
                car2.type = type;
                car2.power = 150;
                car2.setModal("klasse A");
            }

            System.out.print(car2.type + " ");
            System.out.print(car2.power + "hp ");
            System.out.print(" " + car2.getMake());
            System.out.println(" " + car2.getModal());
        }
    }

    public void ProducingSportcar(Type type) {
        if (type == Type.Sportcar) {
            Cars car3 = new Cars();

            {
                car3.type = type;
                car3.power = 300;
                car3.setModal("AMG63");
            }
            System.out.print(car3.type + " ");
            System.out.print(car3.power + "hp");
            System.out.print(" " + car3.getMake());
            System.out.println(" " + car3.getModal());
        }
    }
}





