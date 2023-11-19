public class Main {
    public static void main(String[] args) {

    Boss boss = new Boss();
    boss.setFireWeapen(WeaponType.FIREWEAPON);
        System.out.println("Тип оружия босса: " +boss.getFireWeapen());


    Boss boss1 = new Boss();
    boss1.setHealth(1000);
    boss1.setDamage(100);
        System.out.println("Информация о боссе: ");
        System.out.println("Здоровье босса: " + boss1.getHealth());
        System.out.println("Урон босса: " + boss1.getDamage());





    }
}
