public class LivingElement extends Element {

    private String name;
    private int energy;

    public LivingElement(String name, String look, int energy, int weight, int x, int y, boolean isToxic, boolean canPassThrough) {
        super(look, weight, x, y, isToxic, canPassThrough);
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


}