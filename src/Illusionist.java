public class Illusionist extends Character {

    public Illusionist(String name) {
        super(name, "Illusionist", 100, "Quantum fragments", 5, 20);
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }

    public int cast() {
        return 5;
    }
}
