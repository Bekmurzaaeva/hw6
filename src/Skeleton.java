public class Skeleton extends Boss {
    private int arrows;

    public Skeleton(String name, int health, int damage, Weapon weapon, int arrows) {
        super(name, health, damage, weapon);
        this.arrows = arrows;
    }

    public Skeleton(String name, int health, int damage, String weapon ) {
        super();
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    public String printInfo() {
        String bossInfo = super.printInfo(); // Вызываем метод printInfo() у родительского класса
        String skeletonInfo = bossInfo +
                "\n Количество стрел: " + arrows;
        return skeletonInfo;
    }
}




