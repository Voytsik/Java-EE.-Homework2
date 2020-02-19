package com.evg;

public class Juggler implements Performer {
    private final int beanBags;
    public Juggler(){
        this(3);
    }
    public Juggler(int beanBags){
        this.beanBags = beanBags;
    }
    public void perform() {
        System.out.println("JUGGLING "+beanBags + " BEANBAGS");
    }

}
