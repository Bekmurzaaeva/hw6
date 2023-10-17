public class Boss extends GameEntity {
    private Weapon weapon;

    public Boss(String name, int health, int damage, Weapon weapon) {
        super(name, health, damage);
        this.weapon = weapon;
    }

    public Boss() {
        super();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo() {
        String info = "Имя героя: " + getName() + "\n" +
                "Здоровье босса: " + getHealth() + "\n" +
                "Урон босса: " + getDamage() + "\n" +
                "Оружие босса: " + weapon.getWeaponName() + " (" + weapon.getWeaponType() + ")";
        return info;
    }
}