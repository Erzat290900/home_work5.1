package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDomage(200);
        boss.setHealth(600);
        boss.setTypeOfProtection("kinetical");
        System.out.println(boss.info());

        Hero hero = new Hero(100, 500, "magical");
        System.out.println("_________________________________");
        System.out.println("урон героя: " + hero.getDomage());
        System.out.println("жизнь героя: " + hero.getHealth());
        System.out.println("суперспособность: " + hero.getSuperpowers());






    }


}
