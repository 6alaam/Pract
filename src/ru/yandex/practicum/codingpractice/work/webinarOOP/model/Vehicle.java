package ru.yandex.practicum.codingpractice.work.webinarOOP.model;

public abstract class Vehicle {
    private  String model ;
    private int id ;

    public Vehicle(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
