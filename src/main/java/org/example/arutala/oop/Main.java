package org.example.arutala.oop;

public class Main {
    public static void main(String[] args) {
        Zombie zombie = new Zombie("Zombie", 100, 20);
        Pocong pocong = new Pocong("Pocong", 80, 30);
        Burung burung = new Burung("Burung", 50, 10);

        zombie.attack(pocong);
        zombie.walk();
        burung.attack(zombie);
    }
}
