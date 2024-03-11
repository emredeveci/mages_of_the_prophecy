public class Enchanter extends Character {

    public Enchanter(String name) {
        super(name, "Enchanter", 100, "Star dust", 5, 20);
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }
}
