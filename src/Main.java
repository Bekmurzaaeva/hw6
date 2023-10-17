public class Main {
    public static void main(String[] args) {

        Weapon bossWeapon = new Weapon(WeaponType.AXE, "Dragon Slayer");
        Weapon skeletonWeapon = new Weapon(WeaponType.BOW, "Bone Bow");


        Boss boss = new Boss("Dragon", 1000, 50, bossWeapon);


        Skeleton skeleton1 = new Skeleton("Skeleton 1", 200, 20, skeletonWeapon, 50);

        Skeleton skeleton2 = new Skeleton("Skeleton 2", 150, 15, skeletonWeapon, 30);



        System.out.println("Имя босса: " + boss.getName());
        System.out.println("Здоровье босса: " + boss.getHealth());
        System.out.println("Урон босса: " + boss.getDamage());
        System.out.println("Оружие босса: " + boss.getWeapon().getWeaponName() + " (" + boss.getWeapon().getWeaponType() + ")");

        System.out.println(boss.printInfo());


       
        System.out.println("\nИнформация о первом скелете:");
        System.out.println(skeleton1.printInfo());

        System.out.println("\nИнформация о втором скелете:");
        System.out.println(skeleton2.printInfo());

    }
}






