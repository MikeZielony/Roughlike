public class LivingElement extends Element {

    private String name;
    private int energy;

    public LivingElement(String name, String look, int energy, int weight, int x, int y, boolean canPassThrough) {
        super(look, weight, x, y, canPassThrough);
        this.name = name;
        this.energy = energy;
    }

    public boolean isALive() {
        if (energy > 0) {
        return true;
        }
        else {
            return false;
        }
    }

    public int getEnergy() {
        return this.energy;
    }
    public String getName() {
        return this.name;
    }

    @Override
    protected String getColor() {
        return Color.GREEN_BRIGHT;
    }

}