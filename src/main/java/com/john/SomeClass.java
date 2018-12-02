package com.john;


import memento.CareTaker;
import memento.Memento;

public class SomeClass {

    private String value;
    private CareTaker<SomeClass> careTaker = new CareTaker<>();

    public SomeClass(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public void save() {
        careTaker.add(new Memento<>(new SomeClass(value)));
    }

    public void resetToPrevious() {
        value = careTaker.getLastSavedState().getState().getValue();
    }

    public CareTaker<SomeClass> getCareTaker() {
        return careTaker;
    }
}
