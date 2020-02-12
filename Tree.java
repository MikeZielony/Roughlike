public class Tree extends StaticElement {

    public Tree(String look, int weight, int x, int y, boolean isToxic, boolean canPassThrough) {
        super(look, weight, x, y, isToxic, canPassThrough);

    }

    @Override
    protected String getColor() {
        return Color.GREEN_BOLD;
    }
}