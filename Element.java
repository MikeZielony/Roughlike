public abstract class Element {

    private String look;
    private int weight;
    private int x;
    private int y;
    private boolean isToxic;
    private boolean canPassThrough;
    

    public Element(String look, int weight, int x, int y, boolean isToxic, boolean canPassThrough) {
        this.look = look;
        this.weight = weight;
        this.x = x;
        this.y = y;
        this.isToxic = isToxic;
        this.canPassThrough = canPassThrough;
    }
}
