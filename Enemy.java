
public class Enemy extends LivingElement{

    public Enemy(String name, String look, int energy, int weight, int x, int y, boolean isToxic) {
        super(name, look, energy, weight, x, y, isToxic);
        
    }

    @Override
    protected String getColor() {
        return Color.RED_BOLD_BRIGHT;
    }

}
