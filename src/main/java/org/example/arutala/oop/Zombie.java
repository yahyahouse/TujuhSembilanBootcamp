package org.example.arutala.oop;

public class Zombie extends Monster{
    public Zombie(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    public void walk() {
        System.out.println(super.getName() + " berjalan.");
    }
}
