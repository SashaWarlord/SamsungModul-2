public class Unit {
    protected String name;

    public Unit(String name) {
        Game.countOfUnits++;
        this.name = name;
    }

    protected int health = 100;

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }

    protected int defence = 100;
    protected int power = 10;

    protected float criticalChance = 0.1f;
    protected float pattyChance = 0.1f;

    public int getHealth() { // getter
        return health;
    }

    public int getDefence() {
        return defence;
    }

    public int getPower() {
        return power;
    }

    public float getCriticalChance() {
        return criticalChance;
    }

    public float getPattyChance() {
        return pattyChance;
    }

    public void setHealth(int health) { // setter
        this.health = health;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setCriticalChance(float criticalChance) {
        this.criticalChance = criticalChance;
    }

    public void setPattyChance(float pattyChance) {
        this.pattyChance = pattyChance;
    }

    public void attack(Unit unit) {
        unit.getDamage(power);
    }

    public void getDamage(int damage) {
        this.health -= damage;
    }

}
