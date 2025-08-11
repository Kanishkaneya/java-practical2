// Base class (single inheritance base)
class Hero {
    void power() {
        System.out.println("Has basic hero abilities");
    }
}

// Single inheritance example
class SuperHero extends Hero {
    void fly() {
        System.out.println("Can fly in the sky");
    }
}

// Multilevel inheritance example
class UltimateHero extends SuperHero {
    void timeTravel() {
        System.out.println("Can travel through time!");
    }
}

public class SuperHeroInheritance {
    public static void main(String[] args) {
        // Single Inheritance
        System.out.println("Single Inheritance Example:");
        SuperHero ironMan = new SuperHero();
        ironMan.power(); // from Hero
        ironMan.fly();   // from SuperHero

        // Multilevel Inheritance
        System.out.println("\nMultilevel Inheritance Example:");
        UltimateHero doctorStrange = new UltimateHero();
        doctorStrange.power();     // from Hero
        doctorStrange.fly();       // from SuperHero
        doctorStrange.timeTravel();// from UltimateHero
    }
}
