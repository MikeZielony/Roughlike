public class Player extends LivingElement{


    public Player(String name, String look, int energy, int weight, int x, int y, boolean isToxic) {
        super(name, look, energy, weight, x, y, isToxic);

    }

    @Override
    protected String getColor() {
        return Color.GREEN_BRIGHT;
    }

}
