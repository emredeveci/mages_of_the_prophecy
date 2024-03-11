public class Shade extends Character{

    public Shade(String name) {
        super(name, "Shade", 100, "Soul shards", 5, 20);
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
