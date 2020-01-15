package com.kingstar.decorator.version3;

public class Finery extends Person {
    private Person component;
    public void decorate(Person component){
        this.component=component;
    }

    @Override
    protected void show() {
        if (component!=null){
            component.show();
        }
    }
}

