package org.example.arutala.oop;

public class Monster {
    private String name;
    private int hp;
    private int attackPoint;

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public Monster() {
    }

    public Monster(String name, int hp, int attackPoint) {
        this.name = name;
        this.hp = hp;
        this.attackPoint = attackPoint;
    }

    public void attack(Monster attack) {
        System.out.println(name + " menyerang dengan attack " + attackPoint);
        attack.takeDamage(attackPoint);
    }
    public void takeDamage(int damage) {
        hp -= damage;
        System.out.println(name + " terkena " + damage + " damage. HP tersisa: " + hp);
    }

}
