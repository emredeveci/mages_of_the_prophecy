public class Psychic extends Character {

    public Psychic(String name) {
        super(name, "Psychic", 100, "Gray matter", 5, 20);
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
