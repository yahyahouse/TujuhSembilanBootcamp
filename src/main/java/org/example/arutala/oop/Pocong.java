package org.example.arutala.oop;

public class Pocong extends Monster{
    public Pocong(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }
    public void jump() {
        System.out.println(super.getName() + " melompat");
    }

}
