package org.example.arutala.oop;

public class Burung extends Monster{
    public Burung(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }
    public void jump() {
        System.out.println(super.getName() + " melompat.");
    }

    public void fly() {
        System.out.println(super.getName() + " terbang.");
    }
    public void walk() {
        System.out.println(super.getName() + " berjalan.");
    }
}
