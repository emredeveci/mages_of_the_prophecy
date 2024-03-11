public abstract class Character {

    //common variables and attributes for all characters
    public String name, enhancerType, mageType;
    public int maxHp, hp, enhancerCount, gold;

    public Character(String name, String mageType, int maxHp, String enhancerType, int enhancerCount, int gold) {
        this.name = name;
        this.mageType = mageType;
        this.maxHp = maxHp;
        this.enhancerType = enhancerType;
        this.enhancerCount = enhancerCount;
        this.gold = gold;
    }

    public Character (String name, int maxHp, int enhancerCount){
        this.name = name;
        this.maxHp = maxHp;
        this.enhancerCount = enhancerCount;
        this.hp = maxHp;
    }
    //common methods for all characters
    public abstract int attack();
    public abstract int defend();
}
