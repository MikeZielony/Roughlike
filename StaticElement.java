public class StaticElement extends Element {

    private int energy;

    public StaticElement(String look, int weight, int x, int y, boolean isToxic, boolean canPassThrough) {
        super(look, weight, x, y, isToxic, canPassThrough);
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